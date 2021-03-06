package com.scholanova.groupe2.libraryproject.services.exec;

import java.util.EnumSet;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

public class DDLSchemaGenerator {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder() //
	            .configure("hibernate.cfg.xml") //
	            .build();
	    Metadata metadata = new MetadataSources(serviceRegistry) //
	            .buildMetadata();
	 
	    new SchemaExport() //
	            .setOutputFile("db2-schema.hibernate5.ddl") //
	            .create(EnumSet.of(TargetType.SCRIPT), metadata);
	 
	    metadata.buildSessionFactory().close();
	}

}
