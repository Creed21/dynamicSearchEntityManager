package with.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import with.hibernate.model.Grupa;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class DynamicSearch {

    Logger logger = Logger.getLogger(DynamicSearch.class.getName());

//    @PersistenceContext
    @Autowired
    private EntityManager entityManager;

//    private final Field[] groupFileds = Grupa.class.getDeclaredFields();


    public List<Grupa> getDynamicGroups(Grupa grupa) {
        List<Grupa> foundGroups = new ArrayList<>();

        // build string for searching
        String searchString = buildQuery(grupa);
        logger.info("searchString after creation: "+searchString);

        // create typed query for entity manager
        TypedQuery query = entityManager.createQuery(searchString, Grupa.class);

        //set parameters on typed query
        setParameters(query, grupa);
        logger.info("TypedQuery: "+query);

        return query.getResultList();
    }

    public List<?> getDynamicGeneral(Object searchObject) {
        List<?> foundGroups = new ArrayList<>();

        // build string for searching
        String searchString = buildQueryGeneral(searchObject);
        logger.info("searchString for any object after creation: "+searchString);

        // create typed query for entity manager
        Query query = entityManager.createQuery(searchString);

        //set parameters on typed query
        setParametersGeneral(query, searchObject);
        logger.info("Query for any object: "+query);

        return query.getResultList();
    }

    private String buildQuery(Grupa grupa) {
        StringBuilder sb = new StringBuilder("SELECT g FROM Grupa as g WHERE ");

        for(Field f : grupa.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            Object field_value = null;
            try {
                field_value = f.get(grupa);
            } catch (IllegalArgumentException | IllegalAccessException ex) {}

            if(field_value == null)  continue;

            String field_name = f.getName();
            String attr_type = f.getType().getName();
            attr_type = attr_type.substring(attr_type.lastIndexOf(".")+1);

            logger.info("attr_type: "+attr_type+" field_name: "+field_name+" field_value: "+field_value);

            if(attr_type.equals("String"))
                sb.append(" LOWER(g.").append(field_name).append(") LIKE LOWER(CONCAT('%', :").append(field_name).append(",'%'))");
            else
                sb.append(" g.").append(field_name).append(" = :").append(field_name);

            sb.append(" and ");
            f.setAccessible(false);
        }
        sb.delete(sb.lastIndexOf("and "), sb.length());
        return sb.toString();
    }

    private void setParameters(TypedQuery query, Grupa grupa) {
        for(Field f : grupa.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            Object field_value = null;
            try {
                field_value = f.get(grupa);
            } catch (IllegalArgumentException | IllegalAccessException ex) {}

            if(field_value == null)  continue;

            String field_name = f.getName();
            String attr_type = f.getType().getName();
            attr_type = attr_type.substring(attr_type.lastIndexOf(".")+1);

            if(attr_type.equals("String"))
                field_value = "%"+field_value.toString()+"%";
            query.setParameter(field_name, field_value);
            logger.info("query.setParameter("+field_name+","+field_value+")");
            f.setAccessible(false);
        }
    }

    private void setParameters(Query query, Grupa grupa) {
        for(Field f : grupa.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            Object field_value = null;
            try {
                field_value = f.get(grupa);
            } catch (IllegalArgumentException | IllegalAccessException ex) {}

            if(field_value == null)  continue;

            String field_name = f.getName();
            String attr_type = f.getType().getName();
            attr_type = attr_type.substring(attr_type.lastIndexOf(".")+1);

            if(attr_type.equals("String"))
                field_value = "%"+field_value.toString()+"%";
            query.setParameter(field_name, field_value);
            logger.info("query.setParameter("+field_name+","+field_value+")");
            f.setAccessible(false);
        }
    }



    private String buildQueryGeneral(Object searchObject) {
        String searchClass = searchObject.getClass().getSimpleName();
        String searchClassAlias = searchClass.substring(0, 1);
        StringBuilder sb = new StringBuilder("SELECT "+searchClassAlias+" FROM "+searchClass+" as "+searchClassAlias+" WHERE ");

        for(Field f : searchObject.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            Object field_value = null;
            try {
                field_value = f.get(searchObject);
            } catch (IllegalArgumentException | IllegalAccessException ex) {}

            if(field_value == null)  continue;

            String field_name = f.getName();
            String attr_type = f.getType().getName();
            attr_type = attr_type.substring(attr_type.lastIndexOf(".")+1);

            logger.info("attr_type: "+attr_type+" field_name: "+field_name+" field_value: "+field_value);

            if(attr_type.equals("String"))
                sb.append(" LOWER("+searchClassAlias+".").append(field_name).append(") LIKE LOWER(CONCAT('%', :").append(field_name).append(",'%'))");
            else
                sb.append(" "+searchClassAlias+".").append(field_name).append(" = :").append(field_name);

            sb.append(" and ");
            f.setAccessible(false);
        }
        sb.delete(sb.lastIndexOf("and "), sb.length());
        return sb.toString();
    }

    private void setParametersGeneral(Query query, Object searchObject) {
        for(Field f : searchObject.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            Object field_value = null;
            try {
                field_value = f.get(searchObject);
            } catch (IllegalArgumentException | IllegalAccessException ex) {}

            if(field_value == null)  continue;

            String field_name = f.getName();
//            String attr_type = f.getType().getName();
//            attr_type = attr_type.substring(attr_type.lastIndexOf(".")+1);

//            if(attr_type.equals("String"))
//                field_value = "%"+field_value.toString()+"%";
            query.setParameter(field_name, field_value);
            logger.info("query.setParameter("+field_name+","+field_value+")");
            f.setAccessible(false);
        }
    }


}
