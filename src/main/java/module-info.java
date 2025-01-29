/**
 * 
 */
/**
 * 
 */
module FirstJPA {
	requires java.persistence;
	requires jdk.compiler;
	requires jdk.javadoc;
	requires jdk.jfr;
	requires java.desktop;
	requires java.xml;
	requires org.hibernate.orm.core;
	requires junit;
	
	opens br.com.fthiago.domain to org.hibernate.orm.core;

}