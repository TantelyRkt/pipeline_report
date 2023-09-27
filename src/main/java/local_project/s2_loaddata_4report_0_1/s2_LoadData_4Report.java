// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package local_project.s2_loaddata_4report_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.Utils;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;

	//the import part of tJava_2
	//import java.util.List;

	//the import part of tJava_3
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: s2_LoadData_4Report Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class s2_LoadData_4Report implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(cpi_filename != null){
				
					this.setProperty("cpi_filename", cpi_filename.toString());
				
			}
			
			if(other_indc_filename != null){
				
					this.setProperty("other_indc_filename", other_indc_filename.toString());
				
			}
			
			if(db_host != null){
				
					this.setProperty("db_host", db_host.toString());
				
			}
			
			if(db_port != null){
				
					this.setProperty("db_port", db_port.toString());
				
			}
			
			if(db_pwd != null){
				
					this.setProperty("db_pwd", db_pwd.toString());
				
			}
			
			if(db_user != null){
				
					this.setProperty("db_user", db_user.toString());
				
			}
			
			if(db_name != null){
				
					this.setProperty("db_name", db_name.toString());
				
			}
			
			if(input_path != null){
				
					this.setProperty("input_path", input_path.toString());
				
			}
			
			if(log_path != null){
				
					this.setProperty("log_path", log_path.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String cpi_filename;
public String getCpi_filename(){
	return this.cpi_filename;
}
public String other_indc_filename;
public String getOther_indc_filename(){
	return this.other_indc_filename;
}
public String db_host;
public String getDb_host(){
	return this.db_host;
}
public String db_port;
public String getDb_port(){
	return this.db_port;
}
public String db_pwd;
public String getDb_pwd(){
	return this.db_pwd;
}
public String db_user;
public String getDb_user(){
	return this.db_user;
}
public String db_name;
public String getDb_name(){
	return this.db_name;
}
public String input_path;
public String getInput_path(){
	return this.input_path;
}
public String log_path;
public String getLog_path(){
	return this.log_path;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "s2_LoadData_4Report";
	private final String projectName = "LOCAL_PROJECT";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	LogCatcherUtils tLogCatcher_2 = new LogCatcherUtils();
	LogCatcherUtils tLogCatcher_1 = new LogCatcherUtils();

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				s2_LoadData_4Report.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(s2_LoadData_4Report.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
				tLogCatcher_2.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
				tLogCatcher_2Process(globalMap);
			}
			} catch (TalendException e) {
				// do nothing
			
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLoop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputExcel_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputExcel_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLoop_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputFullRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogCatcher_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogCatcher_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputExcel_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_country_data_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row12_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_data_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row15_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_TMAP_OUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tMap_6_TMAP_IN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tMap_6_TMAP_IN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_7_TMAP_OUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tMap_7_TMAP_IN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tMap_7_TMAP_IN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_8_TMAP_OUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tMap_8_TMAP_IN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tMap_8_TMAP_IN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tLoop_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLoop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					tDie_2Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLoop_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError2", 0, "error");
						}
					
					errorCode = null;
					tDie_3Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tWarn_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputExcel_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	





public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		
	

	
        String properties_tDBConnection_1 = "noDatetimeStringSync=true&useSSL=false";
        if (properties_tDBConnection_1 == null || properties_tDBConnection_1.trim().length() == 0) {
            properties_tDBConnection_1 = "rewriteBatchedStatements=true&allowLoadLocalInfile=true";
        }else {
            if (!properties_tDBConnection_1.contains("rewriteBatchedStatements=")) {
                properties_tDBConnection_1 += "&rewriteBatchedStatements=true";
            }

            if (!properties_tDBConnection_1.contains("allowLoadLocalInfile=")) {
                properties_tDBConnection_1 += "&allowLoadLocalInfile=true";
            }
        }

        String url_tDBConnection_1 = "jdbc:mysql://" + context.db_host + ":" + context.db_port + "/" + context.db_name + "?" + properties_tDBConnection_1;
	String dbUser_tDBConnection_1 = context.db_user;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.db_pwd; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
		
			String driverClass_tDBConnection_1 = "com.mysql.jdbc.Driver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("db_tDBConnection_1",context.db_name);
 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tWarn_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBConnection_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tWarn_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_1", false);
		start_Hash.put("tWarn_1", System.currentTimeMillis());
		
	
	currentComponent="tWarn_1";

	
		int tos_count_tWarn_1 = 0;
		

 



/**
 * [tWarn_1 begin ] stop
 */
	
	/**
	 * [tWarn_1 main ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "INFO","","Database connection established - Server : "+context.db_host,"", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_1", 3, "Database connection established - Server : "+context.db_host, 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_1_WARN_MESSAGES", "Database connection established - Server : "+context.db_host); 
	globalMap.put("tWarn_1_WARN_PRIORITY", 3);
	globalMap.put("tWarn_1_WARN_CODE", 42);
	
} catch (Exception e_tWarn_1) {
globalMap.put("tWarn_1_ERROR_MESSAGE",e_tWarn_1.getMessage());
	logIgnoredError(String.format("tWarn_1 - tWarn failed to log message due to internal error: %s", e_tWarn_1), e_tWarn_1);
}


 


	tos_count_tWarn_1++;

/**
 * [tWarn_1 main ] stop
 */
	
	/**
	 * [tWarn_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_end ] stop
 */
	
	/**
	 * [tWarn_1 end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 

ok_Hash.put("tWarn_1", true);
end_Hash.put("tWarn_1", System.currentTimeMillis());




/**
 * [tWarn_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_1 finally ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
				tLogCatcher_2.addMessage("tDie", "tDie_1", 5, "Database connection failed - Server : "+context.db_host, 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Database connection failed - Server : "+context.db_host);
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Database connection failed - Server : "+context.db_host);
	globalMap.put("tDie_1_DIE_MESSAGES", "Database connection failed - Server : "+context.db_host);
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tWarn_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_2", false);
		start_Hash.put("tWarn_2", System.currentTimeMillis());
		
	
	currentComponent="tWarn_2";

	
		int tos_count_tWarn_2 = 0;
		

 



/**
 * [tWarn_2 begin ] stop
 */
	
	/**
	 * [tWarn_2 main ] start
	 */

	

	
	
	currentComponent="tWarn_2";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_2", "", Thread.currentThread().getId() + "", "INFO","","Starting Integration CPI from excel file to database","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_2", 3, "Starting Integration CPI from excel file to database", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_2_WARN_MESSAGES", "Starting Integration CPI from excel file to database"); 
	globalMap.put("tWarn_2_WARN_PRIORITY", 3);
	globalMap.put("tWarn_2_WARN_CODE", 42);
	
} catch (Exception e_tWarn_2) {
globalMap.put("tWarn_2_ERROR_MESSAGE",e_tWarn_2.getMessage());
	logIgnoredError(String.format("tWarn_2 - tWarn failed to log message due to internal error: %s", e_tWarn_2), e_tWarn_2);
}


 


	tos_count_tWarn_2++;

/**
 * [tWarn_2 main ] stop
 */
	
	/**
	 * [tWarn_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_2";

	

 



/**
 * [tWarn_2 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_2";

	

 



/**
 * [tWarn_2 process_data_end ] stop
 */
	
	/**
	 * [tWarn_2 end ] start
	 */

	

	
	
	currentComponent="tWarn_2";

	

 

ok_Hash.put("tWarn_2", true);
end_Hash.put("tWarn_2", System.currentTimeMillis());




/**
 * [tWarn_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tWarn_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_2 finally ] start
	 */

	

	
	
	currentComponent="tWarn_2";

	

 



/**
 * [tWarn_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_2_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int nb_year;

				public int getNb_year () {
					return this.nb_year;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.nb_year = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.nb_year = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.nb_year);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.nb_year);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("nb_year="+String.valueOf(nb_year));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tFlowToIterate_1 begin ] start
	 */

				
			int NB_ITERATE_tSetGlobalVar_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_1", false);
		start_Hash.put("tFlowToIterate_1", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tFlowToIterate_1 = 0;
		

int nb_line_tFlowToIterate_1 = 0;
int counter_tFlowToIterate_1 = 0;

 



/**
 * [tFlowToIterate_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_1 = java.util.Calendar.getInstance();
		    calendar_tDBInput_1.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_1 = calendar_tDBInput_1.getTime();
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "select count(*) as nb_year from year";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row2.nb_year = 0;
							} else {
		                          
            row2.nb_year = rs_tDBInput_1.getInt(1);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					

 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tFlowToIterate_1 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					


    	            
            globalMap.put("row2.nb_year", row2.nb_year);
    	
 
	   nb_line_tFlowToIterate_1++;  
       counter_tFlowToIterate_1++;
       globalMap.put("tFlowToIterate_1_CURRENT_ITERATION", counter_tFlowToIterate_1);
 


	tos_count_tFlowToIterate_1++;

/**
 * [tFlowToIterate_1 main ] stop
 */
	
	/**
	 * [tFlowToIterate_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 process_data_begin ] stop
 */
	NB_ITERATE_tSetGlobalVar_1++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row14", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnComponentOk2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate9", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate3", 1, "exec" + NB_ITERATE_tSetGlobalVar_1);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";

	
		int tos_count_tSetGlobalVar_1 = 0;
		

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

globalMap.put("nb_year", ((Integer)globalMap.get("row2.nb_year")));

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBInput_6Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate3", 2, "exec" + NB_ITERATE_tSetGlobalVar_1);
						}				
					




	
	/**
	 * [tFlowToIterate_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}

		   globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
		


 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tFlowToIterate_1 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

globalMap.put("tFlowToIterate_1_NB_LINE",nb_line_tFlowToIterate_1);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_1", true);
end_Hash.put("tFlowToIterate_1", System.currentTimeMillis());




/**
 * [tFlowToIterate_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tLoop_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_1 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 finally ] stop
 */

	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row14Struct implements routines.system.IPersistableRow<row14Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id;

				public int getId () {
					return this.id;
				}
				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row14Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row14Struct row14 = new row14Struct();




	
	/**
	 * [tFlowToIterate_4 begin ] start
	 */

				
			int NB_ITERATE_tSetGlobalVar_3 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_4", false);
		start_Hash.put("tFlowToIterate_4", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row14");
					}
				
		int tos_count_tFlowToIterate_4 = 0;
		

int nb_line_tFlowToIterate_4 = 0;
int counter_tFlowToIterate_4 = 0;

 



/**
 * [tFlowToIterate_4 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";

	
		int tos_count_tDBInput_6 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_6 = java.util.Calendar.getInstance();
		    calendar_tDBInput_6.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_6 = calendar_tDBInput_6.getTime();
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				conn_tDBInput_6 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "select id  from indicator where indicator like '%Corruption Perceptions Index%' and active_onreport=1";
		    

            	globalMap.put("tDBInput_6_QUERY",dbquery_tDBInput_6);
		    java.sql.ResultSet rs_tDBInput_6 = null;

		    try {
		    	rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
		    	int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

		    String tmpContent_tDBInput_6 = null;
		    
		    
		    while (rs_tDBInput_6.next()) {
		        nb_line_tDBInput_6++;
		        
							if(colQtyInRs_tDBInput_6 < 1) {
								row14.id = 0;
							} else {
		                          
            row14.id = rs_tDBInput_6.getInt(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					

 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
	/**
	 * [tFlowToIterate_4 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row14"
						
						);
					}
					


    	            
            globalMap.put("row14.id", row14.id);
    	
 
	   nb_line_tFlowToIterate_4++;  
       counter_tFlowToIterate_4++;
       globalMap.put("tFlowToIterate_4_CURRENT_ITERATION", counter_tFlowToIterate_4);
 


	tos_count_tFlowToIterate_4++;

/**
 * [tFlowToIterate_4 main ] stop
 */
	
	/**
	 * [tFlowToIterate_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_4";

	

 



/**
 * [tFlowToIterate_4 process_data_begin ] stop
 */
	NB_ITERATE_tSetGlobalVar_3++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate9", 1, "exec" + NB_ITERATE_tSetGlobalVar_3);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tSetGlobalVar_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_3", false);
		start_Hash.put("tSetGlobalVar_3", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_3";

	
		int tos_count_tSetGlobalVar_3 = 0;
		

 



/**
 * [tSetGlobalVar_3 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_3 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_3";

	

globalMap.put("cpi_indicator", ((Integer)globalMap.get("row14.id")));

 


	tos_count_tSetGlobalVar_3++;

/**
 * [tSetGlobalVar_3 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_3";

	

 



/**
 * [tSetGlobalVar_3 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_3";

	

 



/**
 * [tSetGlobalVar_3 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_3 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_3";

	

 

ok_Hash.put("tSetGlobalVar_3", true);
end_Hash.put("tSetGlobalVar_3", System.currentTimeMillis());




/**
 * [tSetGlobalVar_3 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate9", 2, "exec" + NB_ITERATE_tSetGlobalVar_3);
						}				
					




	
	/**
	 * [tFlowToIterate_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_4";

	

 



/**
 * [tFlowToIterate_4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

	}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
}

		   globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
		


 

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
 */

	
	/**
	 * [tFlowToIterate_4 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_4";

	

globalMap.put("tFlowToIterate_4_NB_LINE",nb_line_tFlowToIterate_4);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row14");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_4", true);
end_Hash.put("tFlowToIterate_4", System.currentTimeMillis());




/**
 * [tFlowToIterate_4 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_4 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_4";

	

 



/**
 * [tFlowToIterate_4 finally ] stop
 */

	
	/**
	 * [tSetGlobalVar_3 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_3";

	

 



/**
 * [tSetGlobalVar_3 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String headers;

				public String getHeaders () {
					return this.headers;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.headers = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.headers = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.headers,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.headers,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("headers="+headers);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tLoop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLoop_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();



	
	/**
	 * [tLoop_1 begin ] start
	 */

				
			int NB_ITERATE_tFileInputExcel_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tLoop_1", false);
		start_Hash.put("tLoop_1", System.currentTimeMillis());
		
	
	currentComponent="tLoop_1";

	
		int tos_count_tLoop_1 = 0;
		

int current_iteration_tLoop_1 = 0;

for(int looptLoop_1 =1; looptLoop_1<=((Integer)globalMap.get("nb_year")); looptLoop_1=looptLoop_1+1){
	
current_iteration_tLoop_1++;
globalMap.put("tLoop_1_CURRENT_VALUE",looptLoop_1);
globalMap.put("tLoop_1_CURRENT_ITERATION",current_iteration_tLoop_1);


 



/**
 * [tLoop_1 begin ] stop
 */
	
	/**
	 * [tLoop_1 main ] start
	 */

	

	
	
	currentComponent="tLoop_1";

	

 


	tos_count_tLoop_1++;

/**
 * [tLoop_1 main ] stop
 */
	
	/**
	 * [tLoop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLoop_1";

	

 



/**
 * [tLoop_1 process_data_begin ] stop
 */
	NB_ITERATE_tFileInputExcel_1++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("country_data", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row8", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("after_tJava_1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("after_tJava_1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report_data", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("If1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("country_data", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row8", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row6", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row7", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate4", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tFileInputExcel_1);
					//Thread.sleep(1000);
				}				
			


	
	/**
	 * [tFlowToIterate_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFlowToIterate_2", false);
		start_Hash.put("tFlowToIterate_2", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tFlowToIterate_2 = 0;
		

int nb_line_tFlowToIterate_2 = 0;
int counter_tFlowToIterate_2 = 0;

 



/**
 * [tFlowToIterate_2 begin ] stop
 */



	
	/**
	 * [tFileInputExcel_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputExcel_1", false);
		start_Hash.put("tFileInputExcel_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputExcel_1";

	
		int tos_count_tFileInputExcel_1 = 0;
		

 
	final String decryptedPassword_tFileInputExcel_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:4H5b5lGjhx5RSnLl644dij5clqlHBi/i5vshgA==");
        String password_tFileInputExcel_1 = decryptedPassword_tFileInputExcel_1;
        if (password_tFileInputExcel_1.isEmpty()){
            password_tFileInputExcel_1 = null;
        }
			class RegexUtil_tFileInputExcel_1 {

		    	public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, String oneSheetName, boolean useRegex) {

			        java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();

			        if(useRegex){//this part process the regex issue

				        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(oneSheetName);
				        for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
				            String sheetName = sheet.getSheetName();
				            java.util.regex.Matcher matcher = pattern.matcher(sheetName);
				            if (matcher.matches()) {
				            	if(sheet != null){
				                	list.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet);
				                }
				            }
				        }

			        }else{
			        	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheet(oneSheetName);
		            	if(sheet != null){
		                	list.add(sheet);
		                }

			        }

			        return list;
			    }

			    public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, int index, boolean useRegex) {
			    	java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list =  new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
			    	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheetAt(index);
	            	if(sheet != null){
	                	list.add(sheet);
	                }
			    	return list;
			    }

			}
		RegexUtil_tFileInputExcel_1 regexUtil_tFileInputExcel_1 = new RegexUtil_tFileInputExcel_1();

		Object source_tFileInputExcel_1 = context.input_path+context.cpi_filename;
		org.apache.poi.xssf.usermodel.XSSFWorkbook workbook_tFileInputExcel_1 = null;

		if(source_tFileInputExcel_1 instanceof String){
			workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create(new java.io.File((String)source_tFileInputExcel_1), password_tFileInputExcel_1, true);
		} else if(source_tFileInputExcel_1 instanceof java.io.InputStream) {
     		workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create((java.io.InputStream)source_tFileInputExcel_1, password_tFileInputExcel_1);
		} else{
			workbook_tFileInputExcel_1 = null;
			throw new java.lang.Exception("The data source should be specified as Inputstream or File Path!");
		}
		try {

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
        sheetList_tFileInputExcel_1.addAll(regexUtil_tFileInputExcel_1.getSheets(workbook_tFileInputExcel_1, 1, false));
    	if(sheetList_tFileInputExcel_1.size() <= 0){
            throw new RuntimeException("Special sheets not exist!");
        }

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_FilterNull_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
		for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_FilterNull_tFileInputExcel_1 : sheetList_tFileInputExcel_1) {
			if(sheet_FilterNull_tFileInputExcel_1!=null && sheetList_FilterNull_tFileInputExcel_1.iterator()!=null && sheet_FilterNull_tFileInputExcel_1.iterator().hasNext()){
				sheetList_FilterNull_tFileInputExcel_1.add(sheet_FilterNull_tFileInputExcel_1);
			}
		}
		sheetList_tFileInputExcel_1 = sheetList_FilterNull_tFileInputExcel_1;
	if(sheetList_tFileInputExcel_1.size()>0){
		int nb_line_tFileInputExcel_1 = 0;

        int begin_line_tFileInputExcel_1 = 2;

        int footer_input_tFileInputExcel_1 = 0;

        int end_line_tFileInputExcel_1=0;
        for(org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1:sheetList_tFileInputExcel_1){
			end_line_tFileInputExcel_1+=(sheet_tFileInputExcel_1.getLastRowNum()+1);
        }
        end_line_tFileInputExcel_1 -= footer_input_tFileInputExcel_1;
        int limit_tFileInputExcel_1 = 1;
        int start_column_tFileInputExcel_1 = ((Integer)globalMap.get("tLoop_1_CURRENT_VALUE"))-1;
        int end_column_tFileInputExcel_1 = -1;
        Integer lastColumn_tFileInputExcel_1 = ((Integer)globalMap.get("tLoop_1_CURRENT_VALUE"));
        if(lastColumn_tFileInputExcel_1!=null){
        	end_column_tFileInputExcel_1 = lastColumn_tFileInputExcel_1.intValue();
        }

        org.apache.poi.xssf.usermodel.XSSFRow row_tFileInputExcel_1 = null;
        org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1.get(0);
        int rowCount_tFileInputExcel_1 = 0;
        int sheetIndex_tFileInputExcel_1 = 0;
        int currentRows_tFileInputExcel_1 = (sheetList_tFileInputExcel_1.get(0).getLastRowNum()+1);

		//for the number format
        java.text.DecimalFormat df_tFileInputExcel_1 = new java.text.DecimalFormat("#.####################################");
        char decimalChar_tFileInputExcel_1 = df_tFileInputExcel_1.getDecimalFormatSymbols().getDecimalSeparator();
		
        for(int i_tFileInputExcel_1 = begin_line_tFileInputExcel_1; i_tFileInputExcel_1 < end_line_tFileInputExcel_1; i_tFileInputExcel_1++){

        	int emptyColumnCount_tFileInputExcel_1 = 0;

        	if (limit_tFileInputExcel_1 != -1 && nb_line_tFileInputExcel_1 >= limit_tFileInputExcel_1) {
        		break;
        	}

            while (i_tFileInputExcel_1 >= rowCount_tFileInputExcel_1 + currentRows_tFileInputExcel_1) {
                rowCount_tFileInputExcel_1 += currentRows_tFileInputExcel_1;
                sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1.get(++sheetIndex_tFileInputExcel_1);
                currentRows_tFileInputExcel_1 = (sheet_tFileInputExcel_1.getLastRowNum()+1);
            }
            globalMap.put("tFileInputExcel_1_CURRENT_SHEET",sheet_tFileInputExcel_1.getSheetName());
            if (rowCount_tFileInputExcel_1 <= i_tFileInputExcel_1) {
                row_tFileInputExcel_1 = sheet_tFileInputExcel_1.getRow(i_tFileInputExcel_1 - rowCount_tFileInputExcel_1);
            }
		    row1 = null;
					int tempRowLength_tFileInputExcel_1 = 1;
				
				int columnIndex_tFileInputExcel_1 = 0;
			
			String[] temp_row_tFileInputExcel_1 = new String[tempRowLength_tFileInputExcel_1];
			int excel_end_column_tFileInputExcel_1;
			if(row_tFileInputExcel_1==null){
				excel_end_column_tFileInputExcel_1=0;
			}else{
				excel_end_column_tFileInputExcel_1=row_tFileInputExcel_1.getLastCellNum();
			}
			int actual_end_column_tFileInputExcel_1;
			if(end_column_tFileInputExcel_1 == -1){
				actual_end_column_tFileInputExcel_1 = excel_end_column_tFileInputExcel_1;
			}
			else{
				actual_end_column_tFileInputExcel_1 = end_column_tFileInputExcel_1 >	excel_end_column_tFileInputExcel_1 ? excel_end_column_tFileInputExcel_1 : end_column_tFileInputExcel_1;
			}
			org.apache.poi.ss.formula.eval.NumberEval ne_tFileInputExcel_1 = null;
			for(int i=0;i<tempRowLength_tFileInputExcel_1;i++){
				if(i + start_column_tFileInputExcel_1 < actual_end_column_tFileInputExcel_1){
					org.apache.poi.ss.usermodel.Cell cell_tFileInputExcel_1 = row_tFileInputExcel_1.getCell(i + start_column_tFileInputExcel_1);
					if(cell_tFileInputExcel_1!=null){
					switch (cell_tFileInputExcel_1.getCellType()) {
                        case STRING:
                            temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1.getRichStringCellValue().getString();
                            break;
                        case NUMERIC:
                            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_1)) {
									temp_row_tFileInputExcel_1[i] =cell_tFileInputExcel_1.getDateCellValue().toString();
                            } else {
                                temp_row_tFileInputExcel_1[i] = df_tFileInputExcel_1.format(cell_tFileInputExcel_1.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            temp_row_tFileInputExcel_1[i] =String.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
                            break;
                        case FORMULA:
        					switch (cell_tFileInputExcel_1.getCachedFormulaResultType()) {
                                case STRING:
                                    temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1.getRichStringCellValue().getString();
                                    break;
                                case NUMERIC:
                                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_1)) {
											temp_row_tFileInputExcel_1[i] =cell_tFileInputExcel_1.getDateCellValue().toString();
                                    } else {
	                                    ne_tFileInputExcel_1 = new org.apache.poi.ss.formula.eval.NumberEval(cell_tFileInputExcel_1.getNumericCellValue());
										temp_row_tFileInputExcel_1[i] = ne_tFileInputExcel_1.getStringValue();
                                    }
                                    break;
                                case BOOLEAN:
                                    temp_row_tFileInputExcel_1[i] =String.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
                                    break;
                                default:
                            		temp_row_tFileInputExcel_1[i] = "";
                            }
                            break;
                        default:
                            temp_row_tFileInputExcel_1[i] = "";
                        }
                	}
                	else{
                		temp_row_tFileInputExcel_1[i]="";
                	}

				}else{
					temp_row_tFileInputExcel_1[i]="";
				}
			}
			boolean whetherReject_tFileInputExcel_1 = false;
			row1 = new row1Struct();
			int curColNum_tFileInputExcel_1 = -1;
			String curColName_tFileInputExcel_1 = "";
			try{
							columnIndex_tFileInputExcel_1 = 0;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "headers";

				row1.headers = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row1.headers = null;
				emptyColumnCount_tFileInputExcel_1++;
			}

				nb_line_tFileInputExcel_1++;
				
			}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_1_ERROR_MESSAGE",e.getMessage());
			whetherReject_tFileInputExcel_1 = true;
					 System.err.println(e.getMessage());
					 row1 = null;
			}


		



 



/**
 * [tFileInputExcel_1 begin ] stop
 */
	
	/**
	 * [tFileInputExcel_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";

	

 


	tos_count_tFileInputExcel_1++;

/**
 * [tFileInputExcel_1 main ] stop
 */
	
	/**
	 * [tFileInputExcel_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";

	

 



/**
 * [tFileInputExcel_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tFlowToIterate_2 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					


    	            
            globalMap.put("row1.headers", row1.headers);
    	
 
	   nb_line_tFlowToIterate_2++;  
       counter_tFlowToIterate_2++;
       globalMap.put("tFlowToIterate_2_CURRENT_ITERATION", counter_tFlowToIterate_2);
 


	tos_count_tFlowToIterate_2++;

/**
 * [tFlowToIterate_2 main ] stop
 */
	
	/**
	 * [tFlowToIterate_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";

	

 



/**
 * [tFlowToIterate_2 process_data_begin ] stop
 */
	
	/**
	 * [tFlowToIterate_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";

	

 



/**
 * [tFlowToIterate_2 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputExcel_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";

	

 



/**
 * [tFileInputExcel_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputExcel_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";

	

			}
			
			
			
			globalMap.put("tFileInputExcel_1_NB_LINE",nb_line_tFileInputExcel_1);
			
				}
			
		} finally { 
				
  				if(!(source_tFileInputExcel_1 instanceof java.io.InputStream)){
  					workbook_tFileInputExcel_1.getPackage().revert();
  				}
				
		}	
		

 

ok_Hash.put("tFileInputExcel_1", true);
end_Hash.put("tFileInputExcel_1", System.currentTimeMillis());




/**
 * [tFileInputExcel_1 end ] stop
 */

	
	/**
	 * [tFlowToIterate_2 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";

	

globalMap.put("tFlowToIterate_2_NB_LINE",nb_line_tFlowToIterate_2);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_2", true);
end_Hash.put("tFlowToIterate_2", System.currentTimeMillis());

   			if (((globalMap.get("row1.headers")) != null && ((String)globalMap.get("row1.headers")).toLowerCase().contains("cpi score")) && ((Integer)globalMap.get("cpi_indicator")) != null) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tJava_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}



/**
 * [tFlowToIterate_2 end ] stop
 */



						if(execStat){
							runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tFileInputExcel_1);
						}				
					




	
	/**
	 * [tLoop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLoop_1";

	

 



/**
 * [tLoop_1 process_data_end ] stop
 */
	
	/**
	 * [tLoop_1 end ] start
	 */

	

	
	
	currentComponent="tLoop_1";

	


	}


 

ok_Hash.put("tLoop_1", true);
end_Hash.put("tLoop_1", System.currentTimeMillis());




/**
 * [tLoop_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLoop_1:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tWarn_3Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLoop_1:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
								} 
							
							tWarn_4Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLoop_1 finally ] start
	 */

	

	
	
	currentComponent="tLoop_1";

	

 



/**
 * [tLoop_1 finally ] stop
 */

	
	/**
	 * [tFileInputExcel_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";

	

 



/**
 * [tFileInputExcel_1 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_2 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_2";

	

 



/**
 * [tFlowToIterate_2 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLoop_1_SUBPROCESS_STATE", 1);
	}
	


public static class report_dataStruct implements routines.system.IPersistableRow<report_dataStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id_year;

				public int getId_year () {
					return this.id_year;
				}
				
			    public Integer value;

				public Integer getValue () {
					return this.value;
				}
				
			    public Integer id_indicator;

				public Integer getId_indicator () {
					return this.id_indicator;
				}
				
			    public int id_country;

				public int getId_country () {
					return this.id_country;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_year = dis.readInt();
					
						this.value = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			        this.id_country = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_year = dis.readInt();
					
						this.value = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			        this.id_country = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_year);
					
					// Integer
				
						writeInteger(this.value,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// int
				
		            	dos.writeInt(this.id_country);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_year);
					
					// Integer
				
						writeInteger(this.value,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// int
				
		            	dos.writeInt(this.id_country);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_year="+String.valueOf(id_year));
		sb.append(",value="+String.valueOf(value));
		sb.append(",id_indicator="+String.valueOf(id_indicator));
		sb.append(",id_country="+String.valueOf(id_country));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(report_dataStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class reportStruct implements routines.system.IPersistableRow<reportStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id_year;

				public int getId_year () {
					return this.id_year;
				}
				
			    public Integer value;

				public Integer getValue () {
					return this.value;
				}
				
			    public Integer id_indicator;

				public Integer getId_indicator () {
					return this.id_indicator;
				}
				
			    public Integer row_number;

				public Integer getRow_number () {
					return this.row_number;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_year = dis.readInt();
					
						this.value = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_year = dis.readInt();
					
						this.value = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_year);
					
					// Integer
				
						writeInteger(this.value,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_year);
					
					// Integer
				
						writeInteger(this.value,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_year="+String.valueOf(id_year));
		sb.append(",value="+String.valueOf(value));
		sb.append(",id_indicator="+String.valueOf(id_indicator));
		sb.append(",row_number="+String.valueOf(row_number));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(reportStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public Integer value;

				public Integer getValue () {
					return this.value;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.value = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.value = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("value="+String.valueOf(value));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id;

				public int getId () {
					return this.id;
				}
				
			    public String year;

				public String getYear () {
					return this.year;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.year,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
					// String
				
						writeString(this.year,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",year="+year);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tJava_1Struct implements routines.system.IPersistableRow<after_tJava_1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String headers;

				public String getHeaders () {
					return this.headers;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.headers = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.headers = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.headers,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.headers,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("headers="+headers);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tJava_1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_3Process(globalMap);
		tFileInputExcel_3Process(globalMap);

		row6Struct row6 = new row6Struct();
row5Struct row5 = new row5Struct();
reportStruct report = new reportStruct();
report_dataStruct report_data = new report_dataStruct();



	
	/**
	 * [tJava_1 begin ] start
	 */

				
			int NB_ITERATE_tDBInput_2 = 0; //for statistics
			

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("Integration indicator : Corruption Perception Index for year : "+((String)globalMap.get("row1.headers")).toLowerCase().replace("cpi score", "").trim()+" - Loaded");


 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	NB_ITERATE_tDBInput_2++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report_data", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row6", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate4", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate2", 1, "exec" + NB_ITERATE_tDBInput_2);
					//Thread.sleep(1000);
				}				
			


	
	/**
	 * [tFlowToIterate_3 begin ] start
	 */

				
			int NB_ITERATE_tFileInputExcel_2 = 0; //for statistics
						
			int NB_ITERATE_tSetGlobalVar_2 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_3", false);
		start_Hash.put("tFlowToIterate_3", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tFlowToIterate_3 = 0;
		

int nb_line_tFlowToIterate_3 = 0;
int counter_tFlowToIterate_3 = 0;

 



/**
 * [tFlowToIterate_3 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_2 = java.util.Calendar.getInstance();
		    calendar_tDBInput_2.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_2 = calendar_tDBInput_2.getTime();
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "select id, year from year where year = '"+(((String)globalMap.get("row1.headers")).toLowerCase().replace("cpi score", "").trim())+"'";
		    

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row6.id = 0;
							} else {
		                          
            row6.id = rs_tDBInput_2.getInt(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row6.year = null;
							} else {
	                         		
        	row6.year = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
					

 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tFlowToIterate_3 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					


    	            
            globalMap.put("row6.id", row6.id);
    	            
            globalMap.put("row6.year", row6.year);
    	
 
	   nb_line_tFlowToIterate_3++;  
       counter_tFlowToIterate_3++;
       globalMap.put("tFlowToIterate_3_CURRENT_ITERATION", counter_tFlowToIterate_3);
 


	tos_count_tFlowToIterate_3++;

/**
 * [tFlowToIterate_3 main ] stop
 */
	
	/**
	 * [tFlowToIterate_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_3";

	

 



/**
 * [tFlowToIterate_3 process_data_begin ] stop
 */
	NB_ITERATE_tSetGlobalVar_2++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate4", 1, "exec" + NB_ITERATE_tSetGlobalVar_2);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tSetGlobalVar_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_2", false);
		start_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_2";

	
		int tos_count_tSetGlobalVar_2 = 0;
		

 



/**
 * [tSetGlobalVar_2 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

globalMap.put("id_year", ((Integer)globalMap.get("row6.id")));

 


	tos_count_tSetGlobalVar_2++;

/**
 * [tSetGlobalVar_2 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 



/**
 * [tSetGlobalVar_2 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 



/**
 * [tSetGlobalVar_2 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 

ok_Hash.put("tSetGlobalVar_2", true);
end_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());




/**
 * [tSetGlobalVar_2 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate4", 2, "exec" + NB_ITERATE_tSetGlobalVar_2);
						}				
					




	NB_ITERATE_tFileInputExcel_2++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report_data", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate5", 1, "exec" + NB_ITERATE_tFileInputExcel_2);
					//Thread.sleep(1000);
				}				
			




	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"report_data");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





        int updateKeyCount_tDBOutput_1 = 3;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 4 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

String tableName_tDBOutput_1 = "report";
boolean whetherReject_tDBOutput_1 = false;

java.util.Calendar calendar_tDBOutput_1 = java.util.Calendar.getInstance();
calendar_tDBOutput_1.set(1, 0, 1, 0, 0, 0);
long year1_tDBOutput_1 = calendar_tDBOutput_1.getTime().getTime();
calendar_tDBOutput_1.set(10000, 0, 1, 0, 0, 0);
long year10000_tDBOutput_1 = calendar_tDBOutput_1.getTime().getTime();
long date_tDBOutput_1;

java.sql.Connection conn_tDBOutput_1 = null;
	conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	

int count_tDBOutput_1=0;
    	
	    String update_tDBOutput_1 = "UPDATE `" + "report" + "` SET `value` = ? WHERE `id_year` = ? AND `id_indicator` = ? AND `id_country` = ?";
	    
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(update_tDBOutput_1);
	    resourceMap.put("pstmtUpdate_tDBOutput_1", pstmtUpdate_tDBOutput_1);
	    String insert_tDBOutput_1 = "INSERT INTO `" + "report" + "` (`id_year`,`value`,`id_indicator`,`id_country`) VALUES (?,?,?,?)";
	         
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"report");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<country_dataStruct> tHash_Lookup_country_data = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<country_dataStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<country_dataStruct>) 
					globalMap.get( "tHash_Lookup_country_data" ))
					;					
					
	

country_dataStruct country_dataHashKey = new country_dataStruct();
country_dataStruct country_dataDefault = new country_dataStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
					globalMap.get( "tHash_Lookup_row8" ))
					;					
					
	

row8Struct row8HashKey = new row8Struct();
row8Struct row8Default = new row8Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
report_dataStruct report_data_tmp = new report_dataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
reportStruct report_tmp = new reportStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputExcel_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputExcel_2", false);
		start_Hash.put("tFileInputExcel_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputExcel_2";

	
		int tos_count_tFileInputExcel_2 = 0;
		

 
	final String decryptedPassword_tFileInputExcel_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:odRktBnJcYoPKQAvE4glaDHWVySXefwGhqMTIg==");
        String password_tFileInputExcel_2 = decryptedPassword_tFileInputExcel_2;
        if (password_tFileInputExcel_2.isEmpty()){
            password_tFileInputExcel_2 = null;
        }
			class RegexUtil_tFileInputExcel_2 {

		    	public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, String oneSheetName, boolean useRegex) {

			        java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();

			        if(useRegex){//this part process the regex issue

				        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(oneSheetName);
				        for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
				            String sheetName = sheet.getSheetName();
				            java.util.regex.Matcher matcher = pattern.matcher(sheetName);
				            if (matcher.matches()) {
				            	if(sheet != null){
				                	list.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet);
				                }
				            }
				        }

			        }else{
			        	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheet(oneSheetName);
		            	if(sheet != null){
		                	list.add(sheet);
		                }

			        }

			        return list;
			    }

			    public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, int index, boolean useRegex) {
			    	java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list =  new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
			    	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheetAt(index);
	            	if(sheet != null){
	                	list.add(sheet);
	                }
			    	return list;
			    }

			}
		RegexUtil_tFileInputExcel_2 regexUtil_tFileInputExcel_2 = new RegexUtil_tFileInputExcel_2();

		Object source_tFileInputExcel_2 = context.input_path+context.cpi_filename;
		org.apache.poi.xssf.usermodel.XSSFWorkbook workbook_tFileInputExcel_2 = null;

		if(source_tFileInputExcel_2 instanceof String){
			workbook_tFileInputExcel_2 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create(new java.io.File((String)source_tFileInputExcel_2), password_tFileInputExcel_2, true);
		} else if(source_tFileInputExcel_2 instanceof java.io.InputStream) {
     		workbook_tFileInputExcel_2 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create((java.io.InputStream)source_tFileInputExcel_2, password_tFileInputExcel_2);
		} else{
			workbook_tFileInputExcel_2 = null;
			throw new java.lang.Exception("The data source should be specified as Inputstream or File Path!");
		}
		try {

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_tFileInputExcel_2 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
        sheetList_tFileInputExcel_2.addAll(regexUtil_tFileInputExcel_2.getSheets(workbook_tFileInputExcel_2, 1, false));
    	if(sheetList_tFileInputExcel_2.size() <= 0){
            throw new RuntimeException("Special sheets not exist!");
        }

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_FilterNull_tFileInputExcel_2 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
		for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_FilterNull_tFileInputExcel_2 : sheetList_tFileInputExcel_2) {
			if(sheet_FilterNull_tFileInputExcel_2!=null && sheetList_FilterNull_tFileInputExcel_2.iterator()!=null && sheet_FilterNull_tFileInputExcel_2.iterator().hasNext()){
				sheetList_FilterNull_tFileInputExcel_2.add(sheet_FilterNull_tFileInputExcel_2);
			}
		}
		sheetList_tFileInputExcel_2 = sheetList_FilterNull_tFileInputExcel_2;
	if(sheetList_tFileInputExcel_2.size()>0){
		int nb_line_tFileInputExcel_2 = 0;

        int begin_line_tFileInputExcel_2 = 3;

        int footer_input_tFileInputExcel_2 = 0;

        int end_line_tFileInputExcel_2=0;
        for(org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_2:sheetList_tFileInputExcel_2){
			end_line_tFileInputExcel_2+=(sheet_tFileInputExcel_2.getLastRowNum()+1);
        }
        end_line_tFileInputExcel_2 -= footer_input_tFileInputExcel_2;
        int limit_tFileInputExcel_2 = -1;
        int start_column_tFileInputExcel_2 = ((Integer)globalMap.get("tLoop_1_CURRENT_VALUE"))-1;
        int end_column_tFileInputExcel_2 = -1;
        Integer lastColumn_tFileInputExcel_2 = ((Integer)globalMap.get("tLoop_1_CURRENT_VALUE"));
        if(lastColumn_tFileInputExcel_2!=null){
        	end_column_tFileInputExcel_2 = lastColumn_tFileInputExcel_2.intValue();
        }

        org.apache.poi.xssf.usermodel.XSSFRow row_tFileInputExcel_2 = null;
        org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_2 = sheetList_tFileInputExcel_2.get(0);
        int rowCount_tFileInputExcel_2 = 0;
        int sheetIndex_tFileInputExcel_2 = 0;
        int currentRows_tFileInputExcel_2 = (sheetList_tFileInputExcel_2.get(0).getLastRowNum()+1);

		//for the number format
        java.text.DecimalFormat df_tFileInputExcel_2 = new java.text.DecimalFormat("#.####################################");
        char decimalChar_tFileInputExcel_2 = df_tFileInputExcel_2.getDecimalFormatSymbols().getDecimalSeparator();
		
        for(int i_tFileInputExcel_2 = begin_line_tFileInputExcel_2; i_tFileInputExcel_2 < end_line_tFileInputExcel_2; i_tFileInputExcel_2++){

        	int emptyColumnCount_tFileInputExcel_2 = 0;

        	if (limit_tFileInputExcel_2 != -1 && nb_line_tFileInputExcel_2 >= limit_tFileInputExcel_2) {
        		break;
        	}

            while (i_tFileInputExcel_2 >= rowCount_tFileInputExcel_2 + currentRows_tFileInputExcel_2) {
                rowCount_tFileInputExcel_2 += currentRows_tFileInputExcel_2;
                sheet_tFileInputExcel_2 = sheetList_tFileInputExcel_2.get(++sheetIndex_tFileInputExcel_2);
                currentRows_tFileInputExcel_2 = (sheet_tFileInputExcel_2.getLastRowNum()+1);
            }
            globalMap.put("tFileInputExcel_2_CURRENT_SHEET",sheet_tFileInputExcel_2.getSheetName());
            if (rowCount_tFileInputExcel_2 <= i_tFileInputExcel_2) {
                row_tFileInputExcel_2 = sheet_tFileInputExcel_2.getRow(i_tFileInputExcel_2 - rowCount_tFileInputExcel_2);
            }
		    row5 = null;
					int tempRowLength_tFileInputExcel_2 = 1;
				
				int columnIndex_tFileInputExcel_2 = 0;
			
			String[] temp_row_tFileInputExcel_2 = new String[tempRowLength_tFileInputExcel_2];
			int excel_end_column_tFileInputExcel_2;
			if(row_tFileInputExcel_2==null){
				excel_end_column_tFileInputExcel_2=0;
			}else{
				excel_end_column_tFileInputExcel_2=row_tFileInputExcel_2.getLastCellNum();
			}
			int actual_end_column_tFileInputExcel_2;
			if(end_column_tFileInputExcel_2 == -1){
				actual_end_column_tFileInputExcel_2 = excel_end_column_tFileInputExcel_2;
			}
			else{
				actual_end_column_tFileInputExcel_2 = end_column_tFileInputExcel_2 >	excel_end_column_tFileInputExcel_2 ? excel_end_column_tFileInputExcel_2 : end_column_tFileInputExcel_2;
			}
			org.apache.poi.ss.formula.eval.NumberEval ne_tFileInputExcel_2 = null;
			for(int i=0;i<tempRowLength_tFileInputExcel_2;i++){
				if(i + start_column_tFileInputExcel_2 < actual_end_column_tFileInputExcel_2){
					org.apache.poi.ss.usermodel.Cell cell_tFileInputExcel_2 = row_tFileInputExcel_2.getCell(i + start_column_tFileInputExcel_2);
					if(cell_tFileInputExcel_2!=null){
					switch (cell_tFileInputExcel_2.getCellType()) {
                        case STRING:
                            temp_row_tFileInputExcel_2[i] = cell_tFileInputExcel_2.getRichStringCellValue().getString();
                            break;
                        case NUMERIC:
                            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_2)) {
									temp_row_tFileInputExcel_2[i] =cell_tFileInputExcel_2.getDateCellValue().toString();
                            } else {
                                temp_row_tFileInputExcel_2[i] = df_tFileInputExcel_2.format(cell_tFileInputExcel_2.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            temp_row_tFileInputExcel_2[i] =String.valueOf(cell_tFileInputExcel_2.getBooleanCellValue());
                            break;
                        case FORMULA:
        					switch (cell_tFileInputExcel_2.getCachedFormulaResultType()) {
                                case STRING:
                                    temp_row_tFileInputExcel_2[i] = cell_tFileInputExcel_2.getRichStringCellValue().getString();
                                    break;
                                case NUMERIC:
                                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_2)) {
											temp_row_tFileInputExcel_2[i] =cell_tFileInputExcel_2.getDateCellValue().toString();
                                    } else {
	                                    ne_tFileInputExcel_2 = new org.apache.poi.ss.formula.eval.NumberEval(cell_tFileInputExcel_2.getNumericCellValue());
										temp_row_tFileInputExcel_2[i] = ne_tFileInputExcel_2.getStringValue();
                                    }
                                    break;
                                case BOOLEAN:
                                    temp_row_tFileInputExcel_2[i] =String.valueOf(cell_tFileInputExcel_2.getBooleanCellValue());
                                    break;
                                default:
                            		temp_row_tFileInputExcel_2[i] = "";
                            }
                            break;
                        default:
                            temp_row_tFileInputExcel_2[i] = "";
                        }
                	}
                	else{
                		temp_row_tFileInputExcel_2[i]="";
                	}

				}else{
					temp_row_tFileInputExcel_2[i]="";
				}
			}
			boolean whetherReject_tFileInputExcel_2 = false;
			row5 = new row5Struct();
			int curColNum_tFileInputExcel_2 = -1;
			String curColName_tFileInputExcel_2 = "";
			try{
							columnIndex_tFileInputExcel_2 = 0;
						
			if( temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2].length() > 0) {
				curColNum_tFileInputExcel_2=columnIndex_tFileInputExcel_2 + start_column_tFileInputExcel_2 + 1;
				curColName_tFileInputExcel_2 = "value";

				row5.value = ParserUtils.parseTo_Integer(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2], null, '.'==decimalChar_tFileInputExcel_2 ? null : decimalChar_tFileInputExcel_2));
			}else{
				row5.value = null;
				emptyColumnCount_tFileInputExcel_2++;
			}

				nb_line_tFileInputExcel_2++;
				
			}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_2_ERROR_MESSAGE",e.getMessage());
			whetherReject_tFileInputExcel_2 = true;
					 System.err.println(e.getMessage());
					 row5 = null;
			}


		



 



/**
 * [tFileInputExcel_2 begin ] stop
 */
	
	/**
	 * [tFileInputExcel_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

 


	tos_count_tFileInputExcel_2++;

/**
 * [tFileInputExcel_2 main ] stop
 */
	
	/**
	 * [tFileInputExcel_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

 



/**
 * [tFileInputExcel_2 process_data_begin ] stop
 */
// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

report = null;


// # Output table : 'report'
report_tmp.id_year = (Integer)globalMap.get("id_year") ;
report_tmp.value = row5.value ;
report_tmp.id_indicator = ((Integer)globalMap.get("cpi_indicator"));
report_tmp.row_number = Numeric.sequence("s1",1,1);
report = report_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "report"
if(report != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"report"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "country_data" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopcountry_data = false;
       		  	    	
       		  	    	
 							country_dataStruct country_dataObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    country_dataHashKey.row_number = report.row_number ;
                        		    		

								
		                        	country_dataHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_country_data.lookup( country_dataHashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_country_data != null && tHash_Lookup_country_data.getCount(country_dataHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'country_data' and it contains more one result from keys :  country_data.row_number = '" + country_dataHashKey.row_number + "'");
								} // G 071
							

							country_dataStruct country_data = null;
                    		  	 
							   
                    		  	 
	       		  	    	country_dataStruct fromLookup_country_data = null;
							country_data = country_dataDefault;
										 
							
								 
							
							
								if (tHash_Lookup_country_data !=null && tHash_Lookup_country_data.hasNext()) { // G 099
								
							
								
								fromLookup_country_data = tHash_Lookup_country_data.next();

							
							
								} // G 099
							
							

							if(fromLookup_country_data != null) {
								country_data = fromLookup_country_data;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row8" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow8 = false;
       		  	    	
       		  	    	
 							row8Struct row8ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row8HashKey.country_code = country_data.country_code ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.country_code = '" + row8HashKey.country_code + "'");
								} // G 071
							

							row8Struct row8 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row8Struct fromLookup_row8 = null;
							row8 = row8Default;
										 
							
								 
							
							
								if (tHash_Lookup_row8 !=null && tHash_Lookup_row8.hasNext()) { // G 099
								
							
								
								fromLookup_row8 = tHash_Lookup_row8.next();

							
							
								} // G 099
							
							

							if(fromLookup_row8 != null) {
								row8 = fromLookup_row8;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

report_data = null;


// # Output table : 'report_data'
// # Filter conditions 
if( 

report.value != null

 ) {
report_data_tmp.id_year = report.id_year ;
report_data_tmp.value = report.value ;
report_data_tmp.id_indicator = report.id_indicator ;
report_data_tmp.id_country = row8.id ;
report_data = report_data_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "report_data"
if(report_data != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"report_data"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
            int updateFlag_tDBOutput_1=0;
                    if(report_data.value == null) {
pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_1.setInt(1, report_data.value);
}


                    pstmtUpdate_tDBOutput_1.setInt(2 + count_tDBOutput_1, report_data.id_year);


                    if(report_data.id_indicator == null) {
pstmtUpdate_tDBOutput_1.setNull(3 + count_tDBOutput_1, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_1.setInt(3 + count_tDBOutput_1, report_data.id_indicator);
}


                    pstmtUpdate_tDBOutput_1.setInt(4 + count_tDBOutput_1, report_data.id_country);


            try {
                updateFlag_tDBOutput_1=pstmtUpdate_tDBOutput_1.executeUpdate();
                updatedCount_tDBOutput_1 = updatedCount_tDBOutput_1+updateFlag_tDBOutput_1;
                rowsToCommitCount_tDBOutput_1 += updateFlag_tDBOutput_1;

            if(updateFlag_tDBOutput_1 == 0) {

                        pstmtInsert_tDBOutput_1.setInt(1, report_data.id_year);

                        if(report_data.value == null) {
pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_1.setInt(2, report_data.value);
}

                        if(report_data.id_indicator == null) {
pstmtInsert_tDBOutput_1.setNull(3, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_1.setInt(3, report_data.id_indicator);
}

                        pstmtInsert_tDBOutput_1.setInt(4, report_data.id_country);

                    int processedCount_tDBOutput_1 = pstmtInsert_tDBOutput_1.executeUpdate();
                    insertedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    nb_line_tDBOutput_1++;
                }else{
                    nb_line_tDBOutput_1++;
             }
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_1 = true;
                        nb_line_tDBOutput_1++;
                            System.err.print(e.getMessage());
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "report_data"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "report"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFileInputExcel_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

 



/**
 * [tFileInputExcel_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputExcel_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

			}
			
			
			
			globalMap.put("tFileInputExcel_2_NB_LINE",nb_line_tFileInputExcel_2);
			
				}
			
		} finally { 
				
  				if(!(source_tFileInputExcel_2 instanceof java.io.InputStream)){
  					workbook_tFileInputExcel_2.getPackage().revert();
  				}
				
		}	
		

 

ok_Hash.put("tFileInputExcel_2", true);
end_Hash.put("tFileInputExcel_2", System.currentTimeMillis());




/**
 * [tFileInputExcel_2 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"report");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



        if(pstmtUpdate_tDBOutput_1 != null){
            pstmtUpdate_tDBOutput_1.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_1");
        }
        if(pstmtInsert_tDBOutput_1 != null){
            pstmtInsert_tDBOutput_1.close();
            resourceMap.remove("pstmtInsert_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"report_data");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */









						if(execStat){
							runStat.updateStatOnConnection("iterate5", 2, "exec" + NB_ITERATE_tFileInputExcel_2);
						}				
					




	
	/**
	 * [tFlowToIterate_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_3";

	

 



/**
 * [tFlowToIterate_3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}

		   globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
		


 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tFlowToIterate_3 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_3";

	

globalMap.put("tFlowToIterate_3_NB_LINE",nb_line_tFlowToIterate_3);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_3", true);
end_Hash.put("tFlowToIterate_3", System.currentTimeMillis());




/**
 * [tFlowToIterate_3 end ] stop
 */



						if(execStat){
							runStat.updateStatOnConnection("iterate2", 2, "exec" + NB_ITERATE_tDBInput_2);
						}				
					




	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_country_data"); 
				     			
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */

	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_3 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_3";

	

 



/**
 * [tFlowToIterate_3 finally ] stop
 */

	
	/**
	 * [tSetGlobalVar_2 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";

	

 



/**
 * [tSetGlobalVar_2 finally ] stop
 */




	
	/**
	 * [tFileInputExcel_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

 



/**
 * [tFileInputExcel_2 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_1 = null;
                if ((pstmtUpdateToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_1")) != null) {
                    pstmtUpdateToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_1 = null;
                if ((pstmtInsertToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_1")) != null) {
                    pstmtInsertToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */


















				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_3", false);
		start_Hash.put("tWarn_3", System.currentTimeMillis());
		
	
	currentComponent="tWarn_3";

	
		int tos_count_tWarn_3 = 0;
		

 



/**
 * [tWarn_3 begin ] stop
 */
	
	/**
	 * [tWarn_3 main ] start
	 */

	

	
	
	currentComponent="tWarn_3";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_3", "", Thread.currentThread().getId() + "", "INFO","","Integration CPI from excel file to database : OK","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_3", 3, "Integration CPI from excel file to database : OK", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_3_WARN_MESSAGES", "Integration CPI from excel file to database : OK"); 
	globalMap.put("tWarn_3_WARN_PRIORITY", 3);
	globalMap.put("tWarn_3_WARN_CODE", 42);
	
} catch (Exception e_tWarn_3) {
globalMap.put("tWarn_3_ERROR_MESSAGE",e_tWarn_3.getMessage());
	logIgnoredError(String.format("tWarn_3 - tWarn failed to log message due to internal error: %s", e_tWarn_3), e_tWarn_3);
}


 


	tos_count_tWarn_3++;

/**
 * [tWarn_3 main ] stop
 */
	
	/**
	 * [tWarn_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_3";

	

 



/**
 * [tWarn_3 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_3";

	

 



/**
 * [tWarn_3 process_data_end ] stop
 */
	
	/**
	 * [tWarn_3 end ] start
	 */

	

	
	
	currentComponent="tWarn_3";

	

 

ok_Hash.put("tWarn_3", true);
end_Hash.put("tWarn_3", System.currentTimeMillis());




/**
 * [tWarn_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_3 finally ] start
	 */

	

	
	
	currentComponent="tWarn_3";

	

 



/**
 * [tWarn_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_3_SUBPROCESS_STATE", 1);
	}
	

public void tDie_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_2", false);
		start_Hash.put("tDie_2", System.currentTimeMillis());
		
	
	currentComponent="tDie_2";

	
		int tos_count_tDie_2 = 0;
		

 



/**
 * [tDie_2 begin ] stop
 */
	
	/**
	 * [tDie_2 main ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

	try {
				tLogCatcher_2.addMessage("tDie", "tDie_2", 5, "Integration CPI from excel file to database : NOK", 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_2_DIE_PRIORITY", 5);
	System.err.println("Integration CPI from excel file to database : NOK");
	
	globalMap.put("tDie_2_DIE_MESSAGE", "Integration CPI from excel file to database : NOK");
	globalMap.put("tDie_2_DIE_MESSAGES", "Integration CPI from excel file to database : NOK");
	
	} catch (Exception | Error e_tDie_2) {
	    globalMap.put("tDie_2_ERROR_MESSAGE",e_tDie_2.getMessage());
		logIgnoredError(String.format("tDie_2 - tDie failed to log message due to internal error: %s", e_tDie_2), e_tDie_2);
	}
	
	currentComponent = "tDie_2";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_2_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_2++;

/**
 * [tDie_2 main ] stop
 */
	
	/**
	 * [tDie_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 process_data_begin ] stop
 */
	
	/**
	 * [tDie_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 process_data_end ] stop
 */
	
	/**
	 * [tDie_2 end ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 

ok_Hash.put("tDie_2", true);
end_Hash.put("tDie_2", System.currentTimeMillis());




/**
 * [tDie_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_2 finally ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_2_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tWarn_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_4", false);
		start_Hash.put("tWarn_4", System.currentTimeMillis());
		
	
	currentComponent="tWarn_4";

	
		int tos_count_tWarn_4 = 0;
		

 



/**
 * [tWarn_4 begin ] stop
 */
	
	/**
	 * [tWarn_4 main ] start
	 */

	

	
	
	currentComponent="tWarn_4";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_4", "", Thread.currentThread().getId() + "", "WARN","","Starting Integration Other Indicator from excel file to database","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_4", 4, "Starting Integration Other Indicator from excel file to database", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_4_WARN_MESSAGES", "Starting Integration Other Indicator from excel file to database"); 
	globalMap.put("tWarn_4_WARN_PRIORITY", 4);
	globalMap.put("tWarn_4_WARN_CODE", 42);
	
} catch (Exception e_tWarn_4) {
globalMap.put("tWarn_4_ERROR_MESSAGE",e_tWarn_4.getMessage());
	logIgnoredError(String.format("tWarn_4 - tWarn failed to log message due to internal error: %s", e_tWarn_4), e_tWarn_4);
}


 


	tos_count_tWarn_4++;

/**
 * [tWarn_4 main ] stop
 */
	
	/**
	 * [tWarn_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_4";

	

 



/**
 * [tWarn_4 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_4";

	

 



/**
 * [tWarn_4 process_data_end ] stop
 */
	
	/**
	 * [tWarn_4 end ] start
	 */

	

	
	
	currentComponent="tWarn_4";

	

 

ok_Hash.put("tWarn_4", true);
end_Hash.put("tWarn_4", System.currentTimeMillis());




/**
 * [tWarn_4 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tWarn_4:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk6", 0, "ok");
								} 
							
							tLoop_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_4 finally ] start
	 */

	

	
	
	currentComponent="tWarn_4";

	

 



/**
 * [tWarn_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_4_SUBPROCESS_STATE", 1);
	}
	


public static class row16Struct implements routines.system.IPersistableRow<row16Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String indicator_loaded_info;

				public String getIndicator_loaded_info () {
					return this.indicator_loaded_info;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_loaded_info = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_loaded_info = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.indicator_loaded_info,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.indicator_loaded_info,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("indicator_loaded_info="+indicator_loaded_info);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row16Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row13Struct implements routines.system.IPersistableRow<row13Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id_country;

				public int getId_country () {
					return this.id_country;
				}
				
			    public Long value;

				public Long getValue () {
					return this.value;
				}
				
			    public Integer id_year;

				public Integer getId_year () {
					return this.id_year;
				}
				
			    public Integer id_indicator;

				public Integer getId_indicator () {
					return this.id_indicator;
				}
				
			    public Byte active_onreport;

				public Byte getActive_onreport () {
					return this.active_onreport;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = dis.readByte();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = dis.readByte();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Byte
				
						if(this.active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeByte(this.active_onreport);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Byte
				
						if(this.active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeByte(this.active_onreport);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_country="+String.valueOf(id_country));
		sb.append(",value="+String.valueOf(value));
		sb.append(",id_year="+String.valueOf(id_year));
		sb.append(",id_indicator="+String.valueOf(id_indicator));
		sb.append(",active_onreport="+String.valueOf(active_onreport));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row13Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id_country;

				public int getId_country () {
					return this.id_country;
				}
				
			    public Long value;

				public Long getValue () {
					return this.value;
				}
				
			    public Integer id_year;

				public Integer getId_year () {
					return this.id_year;
				}
				
			    public Integer id_indicator;

				public Integer getId_indicator () {
					return this.id_indicator;
				}
				
			    public Byte active_onreport;

				public Byte getActive_onreport () {
					return this.active_onreport;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = dis.readByte();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
						this.id_indicator = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = dis.readByte();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Byte
				
						if(this.active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeByte(this.active_onreport);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// Integer
				
						writeInteger(this.id_indicator,dos);
					
					// Byte
				
						if(this.active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeByte(this.active_onreport);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_country="+String.valueOf(id_country));
		sb.append(",value="+String.valueOf(value));
		sb.append(",id_year="+String.valueOf(id_year));
		sb.append(",id_indicator="+String.valueOf(id_indicator));
		sb.append(",active_onreport="+String.valueOf(active_onreport));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String indicator_loaded_info;

				public String getIndicator_loaded_info () {
					return this.indicator_loaded_info;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_loaded_info = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_loaded_info = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.indicator_loaded_info,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.indicator_loaded_info,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("indicator_loaded_info="+indicator_loaded_info);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out4Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public int id_country;

				public int getId_country () {
					return this.id_country;
				}
				
			    public Long value;

				public Long getValue () {
					return this.value;
				}
				
			    public Integer id_year;

				public Integer getId_year () {
					return this.id_year;
				}
				
			    public String indicator_code;

				public String getIndicator_code () {
					return this.indicator_code;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.id_year = readInteger(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id_country);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.id_year,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id_country="+String.valueOf(id_country));
		sb.append(",value="+String.valueOf(value));
		sb.append(",id_year="+String.valueOf(id_year));
		sb.append(",indicator_code="+indicator_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class report_data_Struct implements routines.system.IPersistableRow<report_data_Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public Integer row_number;

				public Integer getRow_number () {
					return this.row_number;
				}
				
			    public Integer row_number_1;

				public Integer getRow_number_1 () {
					return this.row_number_1;
				}
				
			    public Long value;

				public Long getValue () {
					return this.value;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public String indicator_code;

				public String getIndicator_code () {
					return this.indicator_code;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
						this.row_number_1 = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
					this.country_code = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
						this.row_number_1 = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
					this.country_code = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
					// Integer
				
						writeInteger(this.row_number_1,dos);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// String
				
						writeString(this.country_code,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
					// Integer
				
						writeInteger(this.row_number_1,dos);
					
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// String
				
						writeString(this.country_code,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("row_number="+String.valueOf(row_number));
		sb.append(",row_number_1="+String.valueOf(row_number_1));
		sb.append(",value="+String.valueOf(value));
		sb.append(",country_code="+country_code);
		sb.append(",indicator_code="+indicator_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(report_data_Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public Long value;

				public Long getValue () {
					return this.value;
				}
				
			    public Integer row_number;

				public Integer getRow_number () {
					return this.row_number;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.value = null;
           				} else {
           			    	this.value = dis.readLong();
           				}
					
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.value);
		            	}
					
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("value="+String.valueOf(value));
		sb.append(",row_number="+String.valueOf(row_number));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String line;

				public String getLine () {
					return this.line;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.line = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.line = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.line,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.line,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("line="+line);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tLoop_2Struct implements routines.system.IPersistableRow<after_tLoop_2Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		

		

        }

		
			finally {}
		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		

		

        }

		
			finally {}
		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
        }

			finally {}
		

    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
        }

			finally {}
		

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tLoop_2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tLoop_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLoop_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tDBInput_4Process(globalMap);
		tFileInputDelimited_1Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_7Process(globalMap);

		row9Struct row9 = new row9Struct();
out1Struct out1 = new out1Struct();
report_data_Struct report_data_ = new report_data_Struct();
out2Struct out2 = new out2Struct();
out3Struct out3 = new out3Struct();
row13Struct row13 = new row13Struct();
out4Struct out4 = new out4Struct();
row16Struct row16 = new row16Struct();



	
	/**
	 * [tLoop_2 begin ] start
	 */

				
			int NB_ITERATE_tJava_2 = 0; //for statistics
			

	
		
		ok_Hash.put("tLoop_2", false);
		start_Hash.put("tLoop_2", System.currentTimeMillis());
		
	
	currentComponent="tLoop_2";

	
		int tos_count_tLoop_2 = 0;
		

int current_iteration_tLoop_2 = 0;

for(int looptLoop_2 =4; looptLoop_2<=((Integer)globalMap.get("nb_year"))+3; looptLoop_2=looptLoop_2+1){
	
current_iteration_tLoop_2++;
globalMap.put("tLoop_2_CURRENT_VALUE",looptLoop_2);
globalMap.put("tLoop_2_CURRENT_ITERATION",current_iteration_tLoop_2);


 



/**
 * [tLoop_2 begin ] stop
 */
	
	/**
	 * [tLoop_2 main ] start
	 */

	

	
	
	currentComponent="tLoop_2";

	

 


	tos_count_tLoop_2++;

/**
 * [tLoop_2 main ] stop
 */
	
	/**
	 * [tLoop_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLoop_2";

	

 



/**
 * [tLoop_2 process_data_begin ] stop
 */
	NB_ITERATE_tJava_2++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate10", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row9", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row13", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate8", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row16", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out3", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out4", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report_data_", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate7", 1, "exec" + NB_ITERATE_tJava_2);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tJava_2 begin ] start
	 */

				
			int NB_ITERATE_tFileInputFullRow_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tJava_2", false);
		start_Hash.put("tJava_2", System.currentTimeMillis());
		
	
	currentComponent="tJava_2";

	
		int tos_count_tJava_2 = 0;
		


Numeric.resetSequence("s3", 0);


 



/**
 * [tJava_2 begin ] stop
 */
	
	/**
	 * [tJava_2 main ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 


	tos_count_tJava_2++;

/**
 * [tJava_2 main ] stop
 */
	
	/**
	 * [tJava_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_begin ] stop
 */
	NB_ITERATE_tFileInputFullRow_1++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("iterate10", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row9", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row13", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row16", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out3", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out4", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("report_data_", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("OnRowsEnd", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate8", 1, "exec" + NB_ITERATE_tFileInputFullRow_1);
					//Thread.sleep(1000);
				}				
			



	
	/**
	 * [tMap_6_TMAP_OUT begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6_TMAP_OUT", false);
		start_Hash.put("tMap_6_TMAP_OUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out1");
					}
				
		int tos_count_tMap_6_TMAP_OUT = 0;
		





// ###############################
// # Lookup's keys initialization

		org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<dataStruct> tHash_Lookup_data = 
			(org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<dataStruct>) 
				((org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<dataStruct>) 
					 globalMap.get( "tHash_Lookup_data" ))
					;
	

dataStruct dataHashKey = new dataStruct();
dataStruct dataDefault = new dataStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6_TMAP_OUT__Struct  {
}
Var__tMap_6_TMAP_OUT__Struct Var__tMap_6_TMAP_OUT = new Var__tMap_6_TMAP_OUT__Struct();
// ###############################

// ###############################
// # Outputs initialization
// ###############################


	
		class SortableRow_tMap_6_1 implements Comparable<SortableRow_tMap_6_1>, routines.system.IPersistableRow<SortableRow_tMap_6_1> { // G_TM_B_001 

			boolean is__rejectedInnerJoin;

		Integer exprKey_data__row_number;
                            	
			//out1
			Long out1__value;Integer out1__row_number;
		
		
		
		         public void fillFrom( out1Struct out1,  Integer exprKey_data__row_number) {

					
	                			this.out1__value = out1.value;
	                		
	                			this.out1__row_number = out1.row_number;
	                		
							this.exprKey_data__row_number = exprKey_data__row_number;
						
                }

                public void copyDataTo(out1Struct out1) {

					out1.value = this.out1__value;
	                	out1.row_number = this.out1__row_number;
	                	
                }

		
    public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		
						sb.append("out1__value");
						sb.append("=");
						sb.append(String.valueOf(this.out1__value));
					
							sb.append(", ");
						
						sb.append("out1__row_number");
						sb.append("=");
						sb.append(String.valueOf(this.out1__row_number));
					
	    sb.append("]");
	    
	    return sb.toString();
    }

		
		
		
		        public int compareTo(SortableRow_tMap_6_1 other) {

                    int returnValue = 0;
                    
                    
                    	returnValue = checkNullsAndCompare(this.exprKey_data__row_number, other.exprKey_data__row_number);
                    	if (returnValue != 0) {
	                        return returnValue;
                    	}
                    

                    return returnValue;
                }

                private int checkNullsAndCompare(Object object1, Object object2) {
                    int returnValue = 0;
                    if (object1 instanceof Comparable && object2 instanceof Comparable) {
                        returnValue = ((Comparable) object1).compareTo(object2);
                    } else if (object1 != null && object2 != null) {
                        returnValue = compareStrings(object1.toString(), object2
                                .toString());
                    } else if (object1 == null && object2 != null) {
                        returnValue = 1;
                    } else if (object1 != null && object2 == null) {
                        returnValue = -1;
                    } else {
                        returnValue = 0;
                    }

                    return returnValue;
                }

                private int compareStrings(String string1, String string2) {
                    return string1.compareTo(string2);
                }


		
    public void readData(ObjectInputStream dis) {

		synchronized(out1Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = dis.readBoolean();
			
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out1__value = null;
           				} else {
           					
           							this.out1__value = dis.readLong();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out1__row_number = null;
           				} else {
           					
           							this.out1__row_number = dis.readInt();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.exprKey_data__row_number = null;
           				} else {
           					
           							this.exprKey_data__row_number = dis.readInt();
           					
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }
    
    
    public void readData(org.jboss.marshalling.Unmarshaller objectIn) {

		synchronized(out1Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = objectIn.readBoolean();
			
		
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out1__value = null;
           				} else {
           					
           							this.out1__value = objectIn.readLong();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out1__row_number = null;
           				} else {
           					
           							this.out1__row_number = objectIn.readInt();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.exprKey_data__row_number = null;
           				} else {
           					
           							this.exprKey_data__row_number = objectIn.readInt();
           					
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }

    public void writeData(ObjectOutputStream dos) {
        try {

           	dos.writeBoolean(this.is__rejectedInnerJoin);

		
						if(this.out1__value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeLong(this.out1__value);
           					
		            	}
					
						if(this.out1__row_number == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.out1__row_number);
           					
		            	}
					
						if(this.exprKey_data__row_number == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.exprKey_data__row_number);
           					
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public void writeData(org.jboss.marshalling.Marshaller objectOut) {
        try {

           	objectOut.writeBoolean(this.is__rejectedInnerJoin);

		
						if(this.out1__value == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeLong(this.out1__value);
           					
		            	}
					
						if(this.out1__row_number == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.out1__row_number);
           					
		            	}
					
						if(this.exprKey_data__row_number == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.exprKey_data__row_number);
           					
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public boolean supportJboss(){
    	return true;
    }
		
		
		
		} // G_TM_B_001
	
	
	

	org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_6_1> fsi_tMap_6_1 = 
		new org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_6_1>(
			"C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + Thread.currentThread().getId() + "_" + pid +"_tMap_6_1", 2000000) {
			public SortableRow_tMap_6_1 createRowInstance() {
				return new SortableRow_tMap_6_1();
			}
		};
	
	fsi_tMap_6_1.initPut();

		
		        
        



        




 



/**
 * [tMap_6_TMAP_OUT begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row9");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
	String value;
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
out1Struct out1_tmp = new out1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tFileInputFullRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputFullRow_1", false);
		start_Hash.put("tFileInputFullRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputFullRow_1";

	
		int tos_count_tFileInputFullRow_1 = 0;
		

	org.talend.fileprocess.FileInputDelimited fid_tFileInputFullRow_1 = null;

	

	try{//}
		fid_tFileInputFullRow_1 =new org.talend.fileprocess.FileInputDelimited(context.input_path+context.other_indc_filename,"ISO-8859-15","","\r\n",false,1,0,-1,-1,false);
		while (fid_tFileInputFullRow_1.nextRecord()) {//}
			row9 = null;						
	boolean whetherReject_tFileInputFullRow_1 = false;
	row9 = new row9Struct();
		row9.line = fid_tFileInputFullRow_1.get(0);

 



/**
 * [tFileInputFullRow_1 begin ] stop
 */
	
	/**
	 * [tFileInputFullRow_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 


	tos_count_tFileInputFullRow_1++;

/**
 * [tFileInputFullRow_1 main ] stop
 */
	
	/**
	 * [tFileInputFullRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 



/**
 * [tFileInputFullRow_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row9"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;
Var.value = row9.line.split("\",\"")[((Integer)globalMap.get("tLoop_2_CURRENT_VALUE"))].replace("\",","") ;// ###############################
        // ###############################
        // # Output tables

out1 = null;


// # Output table : 'out1'
out1_tmp.value = (String)Var.value != null &&  ((String)Var.value).length()>0 ? Math.round(Double.parseDouble(((String)Var.value).trim())) : null ;
out1_tmp.row_number = Numeric.sequence("s3",1,1);
out1 = out1_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tMap_6_TMAP_OUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6_TMAP_OUT = false;
		
					hasCasePrimitiveKeyWithNull_tMap_6_TMAP_OUT = false;
					
						            	Integer exprKey_data__row_number = out1.row_number ;
            							

                    SortableRow_tMap_6_1 sortableRow_tMap_6_1 = fsi_tMap_6_1.getNextFreeRow();

                    sortableRow_tMap_6_1.fillFrom(out1, exprKey_data__row_number);

                    fsi_tMap_6_1.put(sortableRow_tMap_6_1);

				

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6_TMAP_OUT = false;
		  boolean mainRowRejected_tMap_6_TMAP_OUT = false;
            				    								  
		// ###############################





 


	tos_count_tMap_6_TMAP_OUT++;

/**
 * [tMap_6_TMAP_OUT main ] stop
 */
	
	/**
	 * [tMap_6_TMAP_OUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	

 



/**
 * [tMap_6_TMAP_OUT process_data_begin ] stop
 */
	
	/**
	 * [tMap_6_TMAP_OUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	

 



/**
 * [tMap_6_TMAP_OUT process_data_end ] stop
 */

} // End of branch "out1"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */



	
	/**
	 * [tFileInputFullRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 



/**
 * [tFileInputFullRow_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputFullRow_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

	


            }
           	}finally{
           		if(fid_tFileInputFullRow_1!=null){
            		fid_tFileInputFullRow_1.close();
            	}
            }
            globalMap.put("tFileInputFullRow_1_NB_LINE", fid_tFileInputFullRow_1.getRowNumber());
 

ok_Hash.put("tFileInputFullRow_1", true);
end_Hash.put("tFileInputFullRow_1", System.currentTimeMillis());




/**
 * [tFileInputFullRow_1 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row9");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tMap_6_TMAP_OUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	



// ###############################
// # Lookup hashes releasing
// ###############################      
	
	
	
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out1");
			  	}
			  	
 

ok_Hash.put("tMap_6_TMAP_OUT", true);
end_Hash.put("tMap_6_TMAP_OUT", System.currentTimeMillis());




/**
 * [tMap_6_TMAP_OUT end ] stop
 */


	
	/**
	 * [tMap_7_TMAP_OUT begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7_TMAP_OUT", false);
		start_Hash.put("tMap_7_TMAP_OUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"report_data_");
					}
				
		int tos_count_tMap_7_TMAP_OUT = 0;
		





// ###############################
// # Lookup's keys initialization

		org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row12Struct> tHash_Lookup_row12 = 
			(org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row12Struct>) 
				((org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row12Struct>) 
					 globalMap.get( "tHash_Lookup_row12" ))
					;
	

row12Struct row12HashKey = new row12Struct();
row12Struct row12Default = new row12Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_7_TMAP_OUT__Struct  {
}
Var__tMap_7_TMAP_OUT__Struct Var__tMap_7_TMAP_OUT = new Var__tMap_7_TMAP_OUT__Struct();
// ###############################

// ###############################
// # Outputs initialization
// ###############################


	
		class SortableRow_tMap_7_1 implements Comparable<SortableRow_tMap_7_1>, routines.system.IPersistableRow<SortableRow_tMap_7_1> { // G_TM_B_001 

			boolean is__rejectedInnerJoin;

		String exprKey_row12__country_code;
                            	
			//report_data_
			Integer report_data___row_number;Integer report_data___row_number_1;Long report_data___value;String report_data___country_code;String report_data___indicator_code;
		
		
		
		         public void fillFrom( report_data_Struct report_data_,  String exprKey_row12__country_code) {

					
	                			this.report_data___row_number = report_data_.row_number;
	                		
	                			this.report_data___row_number_1 = report_data_.row_number_1;
	                		
	                			this.report_data___value = report_data_.value;
	                		
	                			this.report_data___country_code = report_data_.country_code;
	                		
	                			this.report_data___indicator_code = report_data_.indicator_code;
	                		
							this.exprKey_row12__country_code = exprKey_row12__country_code;
						
                }

                public void copyDataTo(report_data_Struct report_data_) {

					report_data_.row_number = this.report_data___row_number;
	                	report_data_.row_number_1 = this.report_data___row_number_1;
	                	report_data_.value = this.report_data___value;
	                	report_data_.country_code = this.report_data___country_code;
	                	report_data_.indicator_code = this.report_data___indicator_code;
	                	
                }

		
    public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		
						sb.append("report_data___row_number");
						sb.append("=");
						sb.append(String.valueOf(this.report_data___row_number));
					
							sb.append(", ");
						
						sb.append("report_data___row_number_1");
						sb.append("=");
						sb.append(String.valueOf(this.report_data___row_number_1));
					
							sb.append(", ");
						
						sb.append("report_data___value");
						sb.append("=");
						sb.append(String.valueOf(this.report_data___value));
					
							sb.append(", ");
						
						sb.append("report_data___country_code");
						sb.append("=");
						sb.append(String.valueOf(this.report_data___country_code));
					
							sb.append(", ");
						
						sb.append("report_data___indicator_code");
						sb.append("=");
						sb.append(String.valueOf(this.report_data___indicator_code));
					
	    sb.append("]");
	    
	    return sb.toString();
    }

		
		
		
		        public int compareTo(SortableRow_tMap_7_1 other) {

                    int returnValue = 0;
                    
                    
                    	returnValue = checkNullsAndCompare(this.exprKey_row12__country_code, other.exprKey_row12__country_code);
                    	if (returnValue != 0) {
	                        return returnValue;
                    	}
                    

                    return returnValue;
                }

                private int checkNullsAndCompare(Object object1, Object object2) {
                    int returnValue = 0;
                    if (object1 instanceof Comparable && object2 instanceof Comparable) {
                        returnValue = ((Comparable) object1).compareTo(object2);
                    } else if (object1 != null && object2 != null) {
                        returnValue = compareStrings(object1.toString(), object2
                                .toString());
                    } else if (object1 == null && object2 != null) {
                        returnValue = 1;
                    } else if (object1 != null && object2 == null) {
                        returnValue = -1;
                    } else {
                        returnValue = 0;
                    }

                    return returnValue;
                }

                private int compareStrings(String string1, String string2) {
                    return string1.compareTo(string2);
                }


		
    public void readData(ObjectInputStream dis) {

		synchronized(report_data_Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = dis.readBoolean();
			
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.report_data___row_number = null;
           				} else {
           					
           							this.report_data___row_number = dis.readInt();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.report_data___row_number_1 = null;
           				} else {
           					
           							this.report_data___row_number_1 = dis.readInt();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.report_data___value = null;
           				} else {
           					
           							this.report_data___value = dis.readLong();
           					
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.report_data___country_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.report_data___country_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.report_data___indicator_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.report_data___indicator_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.exprKey_row12__country_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.exprKey_row12__country_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }
    
    
    public void readData(org.jboss.marshalling.Unmarshaller objectIn) {

		synchronized(report_data_Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = objectIn.readBoolean();
			
		
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.report_data___row_number = null;
           				} else {
           					
           							this.report_data___row_number = objectIn.readInt();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.report_data___row_number_1 = null;
           				} else {
           					
           							this.report_data___row_number_1 = objectIn.readInt();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.report_data___value = null;
           				} else {
           					
           							this.report_data___value = objectIn.readLong();
           					
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.report_data___country_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.report_data___country_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.report_data___indicator_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.report_data___indicator_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.exprKey_row12__country_code = null;
           				} else {
           					if(length > report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.exprKey_row12__country_code = new String(report_data_Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }

    public void writeData(ObjectOutputStream dos) {
        try {

           	dos.writeBoolean(this.is__rejectedInnerJoin);

		
						if(this.report_data___row_number == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.report_data___row_number);
           					
		            	}
					
						if(this.report_data___row_number_1 == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.report_data___row_number_1);
           					
		            	}
					
						if(this.report_data___value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeLong(this.report_data___value);
           					
		            	}
					
						if(this.report_data___country_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.report_data___country_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
						if(this.report_data___indicator_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.report_data___indicator_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
						if(this.exprKey_row12__country_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.exprKey_row12__country_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public void writeData(org.jboss.marshalling.Marshaller objectOut) {
        try {

           	objectOut.writeBoolean(this.is__rejectedInnerJoin);

		
						if(this.report_data___row_number == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.report_data___row_number);
           					
		            	}
					
						if(this.report_data___row_number_1 == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.report_data___row_number_1);
           					
		            	}
					
						if(this.report_data___value == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeLong(this.report_data___value);
           					
		            	}
					
						if(this.report_data___country_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.report_data___country_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
						if(this.report_data___indicator_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.report_data___indicator_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
						if(this.exprKey_row12__country_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.exprKey_row12__country_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public boolean supportJboss(){
    	return true;
    }
		
		
		
		} // G_TM_B_001
	
	
	

	org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_7_1> fsi_tMap_7_1 = 
		new org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_7_1>(
			"C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + Thread.currentThread().getId() + "_" + pid +"_tMap_7_1", 2000000) {
			public SortableRow_tMap_7_1 createRowInstance() {
				return new SortableRow_tMap_7_1();
			}
		};
	
	fsi_tMap_7_1.initPut();

		
		        
        



        




 



/**
 * [tMap_7_TMAP_OUT begin ] stop
 */



	
	/**
	 * [tMap_6_TMAP_IN begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6_TMAP_IN", false);
		start_Hash.put("tMap_6_TMAP_IN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	
		int tos_count_tMap_6_TMAP_IN = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6_TMAP_IN__Struct  {
}
Var__tMap_6_TMAP_IN__Struct Var__tMap_6_TMAP_IN = new Var__tMap_6_TMAP_IN__Struct();
// ###############################

// ###############################
// # Outputs initialization
report_data_Struct report_data__tmp = new report_data_Struct();
// ###############################

        
        



        




 



/**
 * [tMap_6_TMAP_IN begin ] stop
 */
	
	/**
	 * [tMap_6_TMAP_IN main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	


		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6_TMAP_IN = false;
		
	
	      fsi_tMap_6_1.endPut();
	      
		
			if(out1 == null) {
				out1 = new out1Struct();
			}
    	    

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6_TMAP_IN = false;
		  boolean mainRowRejected_tMap_6_TMAP_IN = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "data" 
				///////////////////////////////////////////////


				
								
				SortableRow_tMap_6_1 rsc_tMap_6_1;
			
				
					tHash_Lookup_data.initGet();
				
				

				fsi_tMap_6_1.initGet();

				

				//TEST firstLookupIsPersistentSorted=true isFirstPersistentSortedTable=true

				rejectedInnerJoin_tMap_6_TMAP_IN = false;
			
	           	while (fsi_tMap_6_1.hasNext()) { // G_TM_M_250 loop "1"
				

								
									 // CALL close loop of lookup '1'
									

					
				
				
					rsc_tMap_6_1 = (SortableRow_tMap_6_1) fsi_tMap_6_1.next();
               		rsc_tMap_6_1.copyDataTo( out1);
               		
               		rejectedInnerJoin_tMap_6_TMAP_IN = rsc_tMap_6_1.is__rejectedInnerJoin;
               		
			
                            
 					    boolean forceLoopdata = false;
       		  	    	
       		  	    	
 							dataStruct dataObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6_TMAP_IN) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_6_TMAP_IN = false;
								
                        		    		    dataHashKey.row_number = rsc_tMap_6_1.exprKey_data__row_number;
                        		    		

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_data.lookup( dataHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_data.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_6_TMAP_IN = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							

							dataStruct data = null;
                    		  	 
							   
                    		  	 
	       		  	    	dataStruct fromLookup_data = null;
							data = dataDefault;
										 
							
								 
							
							
								if (tHash_Lookup_data !=null && tHash_Lookup_data.hasNext()) { // G 099
								
							
								
								fromLookup_data = tHash_Lookup_data.next();

							
							
								} // G 099
							
							

							if(fromLookup_data != null) {
								data = fromLookup_data;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6_TMAP_IN__Struct Var = Var__tMap_6_TMAP_IN;// ###############################
        // ###############################
        // # Output tables

report_data_ = null;

if(!rejectedInnerJoin_tMap_6_TMAP_IN ) {

// # Output table : 'report_data_'
report_data__tmp.row_number = data.row_number ;
report_data__tmp.row_number_1 = out1.row_number ;
report_data__tmp.value = out1.value ;
report_data__tmp.country_code = data.country_code ;
report_data__tmp.indicator_code = data.indicator_code ;
report_data_ = report_data__tmp;
}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6_TMAP_IN = false;







 


	tos_count_tMap_6_TMAP_IN++;

/**
 * [tMap_6_TMAP_IN main ] stop
 */
	
	/**
	 * [tMap_6_TMAP_IN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	

 



/**
 * [tMap_6_TMAP_IN process_data_begin ] stop
 */
// Start of branch "report_data_"
if(report_data_ != null) { 



	
	/**
	 * [tMap_7_TMAP_OUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"report_data_"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7_TMAP_OUT = false;
		
					hasCasePrimitiveKeyWithNull_tMap_7_TMAP_OUT = false;
					
						            	String exprKey_row12__country_code = (report_data_.country_code != null)?report_data_.country_code.trim() : report_data_.country_code ;
            							

                    SortableRow_tMap_7_1 sortableRow_tMap_7_1 = fsi_tMap_7_1.getNextFreeRow();

                    sortableRow_tMap_7_1.fillFrom(report_data_, exprKey_row12__country_code);

                    fsi_tMap_7_1.put(sortableRow_tMap_7_1);

				

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7_TMAP_OUT = false;
		  boolean mainRowRejected_tMap_7_TMAP_OUT = false;
            				    								  
		// ###############################





 


	tos_count_tMap_7_TMAP_OUT++;

/**
 * [tMap_7_TMAP_OUT main ] stop
 */
	
	/**
	 * [tMap_7_TMAP_OUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	

 



/**
 * [tMap_7_TMAP_OUT process_data_begin ] stop
 */
	
	/**
	 * [tMap_7_TMAP_OUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	

 



/**
 * [tMap_7_TMAP_OUT process_data_end ] stop
 */

} // End of branch "report_data_"



	
		} // G_TM_M_250 close loop read file data '1'
	
	
	/**
	 * [tMap_6_TMAP_IN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	

 



/**
 * [tMap_6_TMAP_IN process_data_end ] stop
 */
	
	/**
	 * [tMap_6_TMAP_IN end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	



// ###############################
// # Lookup hashes releasing
					fsi_tMap_6_1.endGet();
				
// ###############################      


 

ok_Hash.put("tMap_6_TMAP_IN", true);
end_Hash.put("tMap_6_TMAP_IN", System.currentTimeMillis());




/**
 * [tMap_6_TMAP_IN end ] stop
 */

	
	/**
	 * [tMap_7_TMAP_OUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	



// ###############################
// # Lookup hashes releasing
// ###############################      
	
	
	
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"report_data_");
			  	}
			  	
 

ok_Hash.put("tMap_7_TMAP_OUT", true);
end_Hash.put("tMap_7_TMAP_OUT", System.currentTimeMillis());




/**
 * [tMap_7_TMAP_OUT end ] stop
 */


	
	/**
	 * [tMap_8_TMAP_OUT begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_8_TMAP_OUT", false);
		start_Hash.put("tMap_8_TMAP_OUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out2");
					}
				
		int tos_count_tMap_8_TMAP_OUT = 0;
		





// ###############################
// # Lookup's keys initialization

		org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row11Struct> tHash_Lookup_row11 = 
			(org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row11Struct>) 
				((org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row11Struct>) 
					 globalMap.get( "tHash_Lookup_row11" ))
					;
	

row11Struct row11HashKey = new row11Struct();
row11Struct row11Default = new row11Struct();

		org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row15Struct> tHash_Lookup_row15 = 
			(org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row15Struct>) 
				((org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row15Struct>) 
					 globalMap.get( "tHash_Lookup_row15" ))
					;
	

row15Struct row15HashKey = new row15Struct();
row15Struct row15Default = new row15Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_8_TMAP_OUT__Struct  {
	String indicator_loaded_info;
}
Var__tMap_8_TMAP_OUT__Struct Var__tMap_8_TMAP_OUT = new Var__tMap_8_TMAP_OUT__Struct();
// ###############################

// ###############################
// # Outputs initialization
// ###############################


	
		class SortableRow_tMap_8_1 implements Comparable<SortableRow_tMap_8_1>, routines.system.IPersistableRow<SortableRow_tMap_8_1> { // G_TM_B_001 

			boolean is__rejectedInnerJoin;

		String exprKey_row11__indicator_code;
                            	
			//out2
			int out2__id_country;Long out2__value;Integer out2__id_year;String out2__indicator_code;
		
		
		
		         public void fillFrom( out2Struct out2,  String exprKey_row11__indicator_code) {

					
	                			this.out2__id_country = out2.id_country;
	                		
	                			this.out2__value = out2.value;
	                		
	                			this.out2__id_year = out2.id_year;
	                		
	                			this.out2__indicator_code = out2.indicator_code;
	                		
							this.exprKey_row11__indicator_code = exprKey_row11__indicator_code;
						
                }

                public void copyDataTo(out2Struct out2) {

					out2.id_country = this.out2__id_country;
	                	out2.value = this.out2__value;
	                	out2.id_year = this.out2__id_year;
	                	out2.indicator_code = this.out2__indicator_code;
	                	
                }

		
    public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		
						sb.append("out2__id_country");
						sb.append("=");
						sb.append(String.valueOf(this.out2__id_country));
					
							sb.append(", ");
						
						sb.append("out2__value");
						sb.append("=");
						sb.append(String.valueOf(this.out2__value));
					
							sb.append(", ");
						
						sb.append("out2__id_year");
						sb.append("=");
						sb.append(String.valueOf(this.out2__id_year));
					
							sb.append(", ");
						
						sb.append("out2__indicator_code");
						sb.append("=");
						sb.append(String.valueOf(this.out2__indicator_code));
					
	    sb.append("]");
	    
	    return sb.toString();
    }

		
		
		
		        public int compareTo(SortableRow_tMap_8_1 other) {

                    int returnValue = 0;
                    
                    
                    	returnValue = checkNullsAndCompare(this.exprKey_row11__indicator_code, other.exprKey_row11__indicator_code);
                    	if (returnValue != 0) {
	                        return returnValue;
                    	}
                    

                    return returnValue;
                }

                private int checkNullsAndCompare(Object object1, Object object2) {
                    int returnValue = 0;
                    if (object1 instanceof Comparable && object2 instanceof Comparable) {
                        returnValue = ((Comparable) object1).compareTo(object2);
                    } else if (object1 != null && object2 != null) {
                        returnValue = compareStrings(object1.toString(), object2
                                .toString());
                    } else if (object1 == null && object2 != null) {
                        returnValue = 1;
                    } else if (object1 != null && object2 == null) {
                        returnValue = -1;
                    } else {
                        returnValue = 0;
                    }

                    return returnValue;
                }

                private int compareStrings(String string1, String string2) {
                    return string1.compareTo(string2);
                }


		
    public void readData(ObjectInputStream dis) {

		synchronized(out2Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = dis.readBoolean();
			
		
			            this.out2__id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out2__value = null;
           				} else {
           					
           							this.out2__value = dis.readLong();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out2__id_year = null;
           				} else {
           					
           							this.out2__id_year = dis.readInt();
           					
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.out2__indicator_code = null;
           				} else {
           					if(length > out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.out2__indicator_code = new String(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.exprKey_row11__indicator_code = null;
           				} else {
           					if(length > out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.exprKey_row11__indicator_code = new String(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }
    
    
    public void readData(org.jboss.marshalling.Unmarshaller objectIn) {

		synchronized(out2Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = objectIn.readBoolean();
			
		
			            this.out2__id_country = objectIn.readInt();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out2__value = null;
           				} else {
           					
           							this.out2__value = objectIn.readLong();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out2__id_year = null;
           				} else {
           					
           							this.out2__id_year = objectIn.readInt();
           					
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.out2__indicator_code = null;
           				} else {
           					if(length > out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.out2__indicator_code = new String(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.exprKey_row11__indicator_code = null;
           				} else {
           					if(length > out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.exprKey_row11__indicator_code = new String(out2Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }

    public void writeData(ObjectOutputStream dos) {
        try {

           	dos.writeBoolean(this.is__rejectedInnerJoin);

		
		            	dos.writeInt(this.out2__id_country);
					
						if(this.out2__value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeLong(this.out2__value);
           					
		            	}
					
						if(this.out2__id_year == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.out2__id_year);
           					
		            	}
					
						if(this.out2__indicator_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.out2__indicator_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
						if(this.exprKey_row11__indicator_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.exprKey_row11__indicator_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public void writeData(org.jboss.marshalling.Marshaller objectOut) {
        try {

           	objectOut.writeBoolean(this.is__rejectedInnerJoin);

		
		            	objectOut.writeInt(this.out2__id_country);
					
						if(this.out2__value == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeLong(this.out2__value);
           					
		            	}
					
						if(this.out2__id_year == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.out2__id_year);
           					
		            	}
					
						if(this.out2__indicator_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.out2__indicator_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
						if(this.exprKey_row11__indicator_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.exprKey_row11__indicator_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public boolean supportJboss(){
    	return true;
    }
		
		
		
		} // G_TM_B_001
	
	
	

	org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_8_1> fsi_tMap_8_1 = 
		new org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_8_1>(
			"C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + Thread.currentThread().getId() + "_" + pid +"_tMap_8_1", 2000000) {
			public SortableRow_tMap_8_1 createRowInstance() {
				return new SortableRow_tMap_8_1();
			}
		};
	
	fsi_tMap_8_1.initPut();

		
		
	
		class SortableRow_tMap_8_2 implements Comparable<SortableRow_tMap_8_2>, routines.system.IPersistableRow<SortableRow_tMap_8_2> { // G_TM_B_001 

			boolean is__rejectedInnerJoin;

		int exprKey_row15__id;
                            	
			//row11
			int out2__id_country;Long out2__value;Integer out2__id_year;String out2__indicator_code;int row11__id;String row11__indicator_code;Byte row11__active_onreport;String row11__indicator;
		
		
		
		         public void fillFrom( out2Struct out2,  row11Struct row11,  int exprKey_row15__id) {

					
	                			this.out2__id_country = out2.id_country;
	                		
	                			this.out2__value = out2.value;
	                		
	                			this.out2__id_year = out2.id_year;
	                		
	                			this.out2__indicator_code = out2.indicator_code;
	                		
	                			this.row11__id = row11.id;
	                		
	                			this.row11__indicator_code = row11.indicator_code;
	                		
	                			this.row11__active_onreport = row11.active_onreport;
	                		
	                			this.row11__indicator = row11.indicator;
	                		
							this.exprKey_row15__id = exprKey_row15__id;
						
                }

                public void copyDataTo(out2Struct out2, row11Struct row11) {

					out2.id_country = this.out2__id_country;
	                	out2.value = this.out2__value;
	                	out2.id_year = this.out2__id_year;
	                	out2.indicator_code = this.out2__indicator_code;
	                	row11.id = this.row11__id;
	                	row11.indicator_code = this.row11__indicator_code;
	                	row11.active_onreport = this.row11__active_onreport;
	                	row11.indicator = this.row11__indicator;
	                	
                }

		
    public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		
						sb.append("out2__id_country");
						sb.append("=");
						sb.append(String.valueOf(this.out2__id_country));
					
							sb.append(", ");
						
						sb.append("out2__value");
						sb.append("=");
						sb.append(String.valueOf(this.out2__value));
					
							sb.append(", ");
						
						sb.append("out2__id_year");
						sb.append("=");
						sb.append(String.valueOf(this.out2__id_year));
					
							sb.append(", ");
						
						sb.append("out2__indicator_code");
						sb.append("=");
						sb.append(String.valueOf(this.out2__indicator_code));
					
							sb.append(", ");
						
						sb.append("row11__id");
						sb.append("=");
						sb.append(String.valueOf(this.row11__id));
					
							sb.append(", ");
						
						sb.append("row11__indicator_code");
						sb.append("=");
						sb.append(String.valueOf(this.row11__indicator_code));
					
							sb.append(", ");
						
						sb.append("row11__active_onreport");
						sb.append("=");
						sb.append(String.valueOf(this.row11__active_onreport));
					
							sb.append(", ");
						
						sb.append("row11__indicator");
						sb.append("=");
						sb.append(String.valueOf(this.row11__indicator));
					
	    sb.append("]");
	    
	    return sb.toString();
    }

		
		
		
		        public int compareTo(SortableRow_tMap_8_2 other) {

                    int returnValue = 0;
                    
                    
                    	returnValue = checkNullsAndCompare(this.exprKey_row15__id, other.exprKey_row15__id);
                    	if (returnValue != 0) {
	                        return returnValue;
                    	}
                    

                    return returnValue;
                }

                private int checkNullsAndCompare(Object object1, Object object2) {
                    int returnValue = 0;
                    if (object1 instanceof Comparable && object2 instanceof Comparable) {
                        returnValue = ((Comparable) object1).compareTo(object2);
                    } else if (object1 != null && object2 != null) {
                        returnValue = compareStrings(object1.toString(), object2
                                .toString());
                    } else if (object1 == null && object2 != null) {
                        returnValue = 1;
                    } else if (object1 != null && object2 == null) {
                        returnValue = -1;
                    } else {
                        returnValue = 0;
                    }

                    return returnValue;
                }

                private int compareStrings(String string1, String string2) {
                    return string1.compareTo(string2);
                }


		
    public void readData(ObjectInputStream dis) {

		synchronized(row11Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = dis.readBoolean();
			
		
			            this.out2__id_country = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out2__value = null;
           				} else {
           					
           							this.out2__value = dis.readLong();
           					
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.out2__id_year = null;
           				} else {
           					
           							this.out2__id_year = dis.readInt();
           					
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.out2__indicator_code = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.out2__indicator_code = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            this.row11__id = dis.readInt();
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.row11__indicator_code = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.row11__indicator_code = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.row11__active_onreport = null;
           				} else {
           					
           							this.row11__active_onreport = dis.readByte();
           					
           				}
					
			            length = dis.readInt();
           				if (length == -1) {
           	    			this.row11__indicator = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				dis.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.row11__indicator = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            this.exprKey_row15__id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }
    
    
    public void readData(org.jboss.marshalling.Unmarshaller objectIn) {

		synchronized(row11Struct.commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

	        try {
            
				int length = 0;
			
				this.is__rejectedInnerJoin = objectIn.readBoolean();
			
		
			            this.out2__id_country = objectIn.readInt();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out2__value = null;
           				} else {
           					
           							this.out2__value = objectIn.readLong();
           					
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.out2__id_year = null;
           				} else {
           					
           							this.out2__id_year = objectIn.readInt();
           					
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.out2__indicator_code = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.out2__indicator_code = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            this.row11__id = objectIn.readInt();
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.row11__indicator_code = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.row11__indicator_code = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.row11__active_onreport = null;
           				} else {
           					
           							this.row11__active_onreport = objectIn.readByte();
           					
           				}
					
			            length = objectIn.readInt();
           				if (length == -1) {
           	    			this.row11__indicator = null;
           				} else {
           					if(length > row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
           						if(length < 1024 && row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
           						} else {
	               					row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
	               				}
           					}
               				objectIn.readFully(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
               				this.row11__indicator = new String(row11Struct.commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
           				}
					
			            this.exprKey_row15__id = objectIn.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }
        
      } 
    }

    public void writeData(ObjectOutputStream dos) {
        try {

           	dos.writeBoolean(this.is__rejectedInnerJoin);

		
		            	dos.writeInt(this.out2__id_country);
					
						if(this.out2__value == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeLong(this.out2__value);
           					
		            	}
					
						if(this.out2__id_year == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeInt(this.out2__id_year);
           					
		            	}
					
						if(this.out2__indicator_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.out2__indicator_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
		            	dos.writeInt(this.row11__id);
					
						if(this.row11__indicator_code == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.row11__indicator_code.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
						if(this.row11__active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	
           							dos.writeByte(this.row11__active_onreport);
           					
		            	}
					
						if(this.row11__indicator == null) {
			                dos.writeInt(-1);
						} else {
			                byte[] byteArray = this.row11__indicator.getBytes(utf8Charset);
           			    	dos.writeInt(byteArray.length);
               				dos.write(byteArray);
		            	}
					
		            	dos.writeInt(this.exprKey_row15__id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public void writeData(org.jboss.marshalling.Marshaller objectOut) {
        try {

           	objectOut.writeBoolean(this.is__rejectedInnerJoin);

		
		            	objectOut.writeInt(this.out2__id_country);
					
						if(this.out2__value == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeLong(this.out2__value);
           					
		            	}
					
						if(this.out2__id_year == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeInt(this.out2__id_year);
           					
		            	}
					
						if(this.out2__indicator_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.out2__indicator_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
		            	objectOut.writeInt(this.row11__id);
					
						if(this.row11__indicator_code == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.row11__indicator_code.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
						if(this.row11__active_onreport == null) {
			                objectOut.writeByte(-1);
						} else {
               				objectOut.writeByte(0);
           			    	
           							objectOut.writeByte(this.row11__active_onreport);
           					
		            	}
					
						if(this.row11__indicator == null) {
			                objectOut.writeInt(-1);
						} else {
			                byte[] byteArray = this.row11__indicator.getBytes(utf8Charset);
           			    	objectOut.writeInt(byteArray.length);
               				objectOut.write(byteArray);
		            	}
					
		            	objectOut.writeInt(this.exprKey_row15__id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }
    }
    
    public boolean supportJboss(){
    	return true;
    }
		
		
		
		} // G_TM_B_001
	
	
	

	org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_8_2> fsi_tMap_8_2 = 
		new org.talend.designer.components.lookup.persistent.PersistentRowSorterIterator<SortableRow_tMap_8_2>(
			"C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + Thread.currentThread().getId() + "_" + pid +"_tMap_8_2", 2000000) {
			public SortableRow_tMap_8_2 createRowInstance() {
				return new SortableRow_tMap_8_2();
			}
		};
	
	fsi_tMap_8_2.initPut();

		
		        
        



        




 



/**
 * [tMap_8_TMAP_OUT begin ] stop
 */



	
	/**
	 * [tMap_7_TMAP_IN begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7_TMAP_IN", false);
		start_Hash.put("tMap_7_TMAP_IN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	
		int tos_count_tMap_7_TMAP_IN = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_7_TMAP_IN__Struct  {
}
Var__tMap_7_TMAP_IN__Struct Var__tMap_7_TMAP_IN = new Var__tMap_7_TMAP_IN__Struct();
// ###############################

// ###############################
// # Outputs initialization
out2Struct out2_tmp = new out2Struct();
// ###############################

        
        



        




 



/**
 * [tMap_7_TMAP_IN begin ] stop
 */
	
	/**
	 * [tMap_7_TMAP_IN main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	


		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7_TMAP_IN = false;
		
	
	      fsi_tMap_7_1.endPut();
	      
		
			if(report_data_ == null) {
				report_data_ = new report_data_Struct();
			}
    	    

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7_TMAP_IN = false;
		  boolean mainRowRejected_tMap_7_TMAP_IN = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row12" 
				///////////////////////////////////////////////


				
								
				SortableRow_tMap_7_1 rsc_tMap_7_1;
			
				
					tHash_Lookup_row12.initGet();
				
				

				fsi_tMap_7_1.initGet();

				

				//TEST firstLookupIsPersistentSorted=true isFirstPersistentSortedTable=true

				rejectedInnerJoin_tMap_7_TMAP_IN = false;
			
	           	while (fsi_tMap_7_1.hasNext()) { // G_TM_M_250 loop "1"
				

								
									 // CALL close loop of lookup '1'
									

					
				
				
					rsc_tMap_7_1 = (SortableRow_tMap_7_1) fsi_tMap_7_1.next();
               		rsc_tMap_7_1.copyDataTo( report_data_);
               		
               		rejectedInnerJoin_tMap_7_TMAP_IN = rsc_tMap_7_1.is__rejectedInnerJoin;
               		
			
                            
 					    boolean forceLooprow12 = false;
       		  	    	
       		  	    	
 							row12Struct row12ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_7_TMAP_IN) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_7_TMAP_IN = false;
								
                        		    		    row12HashKey.country_code = rsc_tMap_7_1.exprKey_row12__country_code;
                        		    		

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row12.lookup( row12HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							

							row12Struct row12 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row12Struct fromLookup_row12 = null;
							row12 = row12Default;
										 
							
								 
							
							
								if (tHash_Lookup_row12 !=null && tHash_Lookup_row12.hasNext()) { // G 099
								
							
								
								fromLookup_row12 = tHash_Lookup_row12.next();

							
							
								} // G 099
							
							

							if(fromLookup_row12 != null) {
								row12 = fromLookup_row12;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_7_TMAP_IN__Struct Var = Var__tMap_7_TMAP_IN;// ###############################
        // ###############################
        // # Output tables

out2 = null;


// # Output table : 'out2'
out2_tmp.id_country = row12.id ;
out2_tmp.value = report_data_.value ;
out2_tmp.id_year = ((Integer)globalMap.get("tLoop_2_CURRENT_VALUE"))-3;
out2_tmp.indicator_code = report_data_.indicator_code ;
out2 = out2_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_7_TMAP_IN = false;







 


	tos_count_tMap_7_TMAP_IN++;

/**
 * [tMap_7_TMAP_IN main ] stop
 */
	
	/**
	 * [tMap_7_TMAP_IN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	

 



/**
 * [tMap_7_TMAP_IN process_data_begin ] stop
 */
// Start of branch "out2"
if(out2 != null) { 



	
	/**
	 * [tMap_8_TMAP_OUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out2"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_8_TMAP_OUT = false;
		
					hasCasePrimitiveKeyWithNull_tMap_8_TMAP_OUT = false;
					
						            	String exprKey_row11__indicator_code = out2.indicator_code ;
            							

                    SortableRow_tMap_8_1 sortableRow_tMap_8_1 = fsi_tMap_8_1.getNextFreeRow();

                    sortableRow_tMap_8_1.fillFrom(out2, exprKey_row11__indicator_code);

                    fsi_tMap_8_1.put(sortableRow_tMap_8_1);

				

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_8_TMAP_OUT = false;
		  boolean mainRowRejected_tMap_8_TMAP_OUT = false;
            				    								  
		// ###############################





 


	tos_count_tMap_8_TMAP_OUT++;

/**
 * [tMap_8_TMAP_OUT main ] stop
 */
	
	/**
	 * [tMap_8_TMAP_OUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	

 



/**
 * [tMap_8_TMAP_OUT process_data_begin ] stop
 */
	
	/**
	 * [tMap_8_TMAP_OUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	

 



/**
 * [tMap_8_TMAP_OUT process_data_end ] stop
 */

} // End of branch "out2"



	
		} // G_TM_M_250 close loop read file data '1'
	
	
	/**
	 * [tMap_7_TMAP_IN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	

 



/**
 * [tMap_7_TMAP_IN process_data_end ] stop
 */
	
	/**
	 * [tMap_7_TMAP_IN end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	



// ###############################
// # Lookup hashes releasing
					fsi_tMap_7_1.endGet();
				
// ###############################      


 

ok_Hash.put("tMap_7_TMAP_IN", true);
end_Hash.put("tMap_7_TMAP_IN", System.currentTimeMillis());




/**
 * [tMap_7_TMAP_IN end ] stop
 */

	
	/**
	 * [tMap_8_TMAP_OUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	



// ###############################
// # Lookup hashes releasing
// ###############################      
	
	
	
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out2");
			  	}
			  	
 

ok_Hash.put("tMap_8_TMAP_OUT", true);
end_Hash.put("tMap_8_TMAP_OUT", System.currentTimeMillis());




/**
 * [tMap_8_TMAP_OUT end ] stop
 */



	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row13");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





        int updateKeyCount_tDBOutput_2 = 3;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 4 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

String tableName_tDBOutput_2 = "report";
boolean whetherReject_tDBOutput_2 = false;

java.util.Calendar calendar_tDBOutput_2 = java.util.Calendar.getInstance();
calendar_tDBOutput_2.set(1, 0, 1, 0, 0, 0);
long year1_tDBOutput_2 = calendar_tDBOutput_2.getTime().getTime();
calendar_tDBOutput_2.set(10000, 0, 1, 0, 0, 0);
long year10000_tDBOutput_2 = calendar_tDBOutput_2.getTime().getTime();
long date_tDBOutput_2;

java.sql.Connection conn_tDBOutput_2 = null;
	conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	

int count_tDBOutput_2=0;
    	
	    String update_tDBOutput_2 = "UPDATE `" + "report" + "` SET `value` = ? WHERE `id_country` = ? AND `id_year` = ? AND `id_indicator` = ?";
	    
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmtUpdate_tDBOutput_2", pstmtUpdate_tDBOutput_2);
	    String insert_tDBOutput_2 = "INSERT INTO `" + "report" + "` (`id_country`,`value`,`id_year`,`id_indicator`) VALUES (?,?,?,?)";
	         
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
	    resourceMap.put("pstmtInsert_tDBOutput_2", pstmtInsert_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out3");
					}
				
		int tos_count_tFilterRow_1 = 0;
		
    int nb_line_tFilterRow_1 = 0;
    int nb_line_ok_tFilterRow_1 = 0;
    int nb_line_reject_tFilterRow_1 = 0;

    class Operator_tFilterRow_1 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_1(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_1 begin ] stop
 */





	
	/**
	 * [tFlowToIterate_5 begin ] start
	 */

				
			int NB_ITERATE_tJava_3 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_5", false);
		start_Hash.put("tFlowToIterate_5", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row16");
					}
				
		int tos_count_tFlowToIterate_5 = 0;
		

int nb_line_tFlowToIterate_5 = 0;
int counter_tFlowToIterate_5 = 0;

 



/**
 * [tFlowToIterate_5 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out4");
					}
				
		int tos_count_tUniqRow_1 = 0;
		

	
		class KeyStruct_tUniqRow_1 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String indicator_loaded_info;        
	        
		    @Override
			public int hashCode() {
				if (this.hashCodeDirty) {
					final int prime = PRIME;
					int result = DEFAULT_HASHCODE;
			
								result = prime * result + ((this.indicator_loaded_info == null) ? 0 : this.indicator_loaded_info.hashCode());
								
		    		this.hashCode = result;
		    		this.hashCodeDirty = false;		
				}
				return this.hashCode;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj) return true;
				if (obj == null) return false;
				if (getClass() != obj.getClass()) return false;
				final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;
				
									if (this.indicator_loaded_info == null) {
										if (other.indicator_loaded_info != null) 
											return false;
								
									} else if (!this.indicator_loaded_info.equals(other.indicator_loaded_info))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_1 = 0;
int nb_duplicates_tUniqRow_1 = 0;
KeyStruct_tUniqRow_1 finder_tUniqRow_1 = new KeyStruct_tUniqRow_1();
java.util.Set<KeyStruct_tUniqRow_1> keystUniqRow_1 = new java.util.HashSet<KeyStruct_tUniqRow_1>(); 

 



/**
 * [tUniqRow_1 begin ] stop
 */



	
	/**
	 * [tMap_8_TMAP_IN begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_8_TMAP_IN", false);
		start_Hash.put("tMap_8_TMAP_IN", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	
		int tos_count_tMap_8_TMAP_IN = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_8_TMAP_IN__Struct  {
	String indicator_loaded_info;
}
Var__tMap_8_TMAP_IN__Struct Var__tMap_8_TMAP_IN = new Var__tMap_8_TMAP_IN__Struct();
// ###############################

// ###############################
// # Outputs initialization
out3Struct out3_tmp = new out3Struct();
out4Struct out4_tmp = new out4Struct();
// ###############################

        
        



        




 



/**
 * [tMap_8_TMAP_IN begin ] stop
 */
	
	/**
	 * [tMap_8_TMAP_IN main ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	


		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN = false;
		
	
	      fsi_tMap_8_1.endPut();
	      
		
			if(out2 == null) {
				out2 = new out2Struct();
			}
    	    

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_8_TMAP_IN = false;
		  boolean mainRowRejected_tMap_8_TMAP_IN = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row11" 
				///////////////////////////////////////////////


				
								
				SortableRow_tMap_8_1 rsc_tMap_8_1;
			
				
					tHash_Lookup_row11.initGet();
				
				

				fsi_tMap_8_1.initGet();

				

				//TEST firstLookupIsPersistentSorted=true isFirstPersistentSortedTable=true

				rejectedInnerJoin_tMap_8_TMAP_IN = false;
			
	           	while (fsi_tMap_8_1.hasNext()) { // G_TM_M_250 loop "1"
				

								

					
				
				
					rsc_tMap_8_1 = (SortableRow_tMap_8_1) fsi_tMap_8_1.next();
               		rsc_tMap_8_1.copyDataTo( out2);
               		
               		rejectedInnerJoin_tMap_8_TMAP_IN = rsc_tMap_8_1.is__rejectedInnerJoin;
               		
			
                            
 					    boolean forceLooprow11 = false;
       		  	    	
       		  	    	
 							row11Struct row11ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_8_TMAP_IN) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN = false;
								
                        		    		    row11HashKey.indicator_code = rsc_tMap_8_1.exprKey_row11__indicator_code;
                        		    		

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row11.lookup( row11HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row11.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_8_TMAP_IN = true;
	  								
						
									
	
		  								forceLooprow11 = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLooprow11 = true;
			           		  	} // G 21
                    		  	
                    		

							row11Struct row11 = null;
                    		  	 
							

								while ((tHash_Lookup_row11 != null && tHash_Lookup_row11.hasNext()) || forceLooprow11) { // G_TM_M_043

								
                    		  	 
							   
                    		  	 
	       		  	    	row11Struct fromLookup_row11 = null;
							row11 = row11Default;
										 
							
								
								if(!forceLooprow11) { // G 46
								
							
								 
							
								
								fromLookup_row11 = tHash_Lookup_row11.next();

							

							if(fromLookup_row11 != null) {
								row11 = fromLookup_row11;
							}
							
							
							
			  							
								
	                    		  	
		                    
	                    	
	                    		} // G 46
	                    		  	
								forceLooprow11 = false;
									 	
							
								
												int exprKey_row15__id = 0;
								
											
		            					if(!rejectedInnerJoin_tMap_8_TMAP_IN) { // G_TM_M_255
		            				
                        		    				Object exprKeyValue_row15__id = out2.id_year ;
                        		    				if(exprKeyValue_row15__id == null) {
            	            		    				hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN = true;
			                        		    	} else {
							            				exprKey_row15__id =  (int)(Integer) exprKeyValue_row15__id;
                       		    					}
                       		    					
                    					} // G_TM_M_255
                    				

								SortableRow_tMap_8_2 rsc_tMap_8_2 = new SortableRow_tMap_8_2();

								rsc_tMap_8_2.fillFrom( out2,  row11,  exprKey_row15__id);

								rsc_tMap_8_2.is__rejectedInnerJoin = rejectedInnerJoin_tMap_8_TMAP_IN;
						
								rejectedInnerJoin_tMap_8_TMAP_IN = false;

								// Sort and store in KeyFile(s) and DataFile(s)
								fsi_tMap_8_2.put(rsc_tMap_8_2);
					
								
								if(forceLooprow11) {
									break;
								}
							
	            			}  // G_TM_M_043 loop (MultipleResult) row11
					
	    	        	} // G_TM_M_250 loop "1"

	            		
	            	
	           	
	            	
	            	
	            				
					fsi_tMap_8_1.endGet();
				 
	            	
	            	fsi_tMap_8_2.endPut();
	            	
				

				///////////////////////////////////////////////
				// Starting Lookup Table "row15" 
				///////////////////////////////////////////////


				
								
				SortableRow_tMap_8_2 rsc_tMap_8_2;
			
				
					tHash_Lookup_row15.initGet();
				
				

				fsi_tMap_8_2.initGet();

				

	       			//row11 = new row11Struct();

	       			 row11Struct row11 = new row11Struct();
	       			
					

				//TEST firstLookupIsPersistentSorted=true isFirstPersistentSortedTable=false

				rejectedInnerJoin_tMap_8_TMAP_IN = false;
			
	           	while (fsi_tMap_8_2.hasNext()) { // G_TM_M_250 loop "2"
				

								
									 // CALL close loop of lookup '2'
									

					
				
				
					rsc_tMap_8_2 = (SortableRow_tMap_8_2) fsi_tMap_8_2.next();
               		rsc_tMap_8_2.copyDataTo( out2,  row11);
               		
               		rejectedInnerJoin_tMap_8_TMAP_IN = rsc_tMap_8_2.is__rejectedInnerJoin;
               		
			
                            
 					    boolean forceLooprow15 = false;
       		  	    	
       		  	    	
 							row15Struct row15ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_8_TMAP_IN) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN = false;
								
	                        		    	Object exprKeyValue_row15__id = out2.id_year ;
	                        		    	if(exprKeyValue_row15__id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN = true;
	                        		    	} else {
	                        		    		row15HashKey.id = (int)(Integer) rsc_tMap_8_2.exprKey_row15__id;
                        		    		}
                        		    		

								
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_8_TMAP_IN) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row15.lookup( row15HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							

							row15Struct row15 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row15Struct fromLookup_row15 = null;
							row15 = row15Default;
										 
							
								 
							
							
								if (tHash_Lookup_row15 !=null && tHash_Lookup_row15.hasNext()) { // G 099
								
							
								
								fromLookup_row15 = tHash_Lookup_row15.next();

							
							
								} // G 099
							
							

							if(fromLookup_row15 != null) {
								row15 = fromLookup_row15;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_8_TMAP_IN__Struct Var = Var__tMap_8_TMAP_IN;
Var.indicator_loaded_info = "Integration indicator : "+row11.indicator +" for year : "+row15.year +" - Loaded" ;// ###############################
        // ###############################
        // # Output tables

out3 = null;
out4 = null;

if(!rejectedInnerJoin_tMap_8_TMAP_IN ) {

// # Output table : 'out3'
// # Filter conditions 
if( 

row11.active_onreport == 1

 ) {
out3_tmp.id_country = out2.id_country ;
out3_tmp.value = out2.value ;
out3_tmp.id_year = out2.id_year ;
out3_tmp.id_indicator = row11.id ;
out3_tmp.active_onreport = row11.active_onreport ;
out3 = out3_tmp;
} // closing filter/reject

// # Output table : 'out4'
// # Filter conditions 
if( 

row11.active_onreport == 1

 ) {
out4_tmp.indicator_loaded_info = Var.indicator_loaded_info ;
out4 = out4_tmp;
} // closing filter/reject
}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_8_TMAP_IN = false;







 


	tos_count_tMap_8_TMAP_IN++;

/**
 * [tMap_8_TMAP_IN main ] stop
 */
	
	/**
	 * [tMap_8_TMAP_IN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	

 



/**
 * [tMap_8_TMAP_IN process_data_begin ] stop
 */
// Start of branch "out3"
if(out3 != null) { 



	
	/**
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out3"
						
						);
					}
					

          row13 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");
            ope_tFilterRow_1.matches((out3.active_onreport == null? false : out3.active_onreport.compareTo(ParserUtils.parseTo_Byte(String.valueOf(1))) == 0)
                           , "active_onreport.compareTo(1) == 0 failed");
		 	
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row13 == null){ 
                row13 = new row13Struct();
              }
               row13.id_country = out3.id_country;
               row13.value = out3.value;
               row13.id_year = out3.id_year;
               row13.id_indicator = out3.id_indicator;
               row13.active_onreport = out3.active_onreport;    
      nb_line_ok_tFilterRow_1++;
    } else {
      nb_line_reject_tFilterRow_1++;
    }

nb_line_tFilterRow_1++;

 


	tos_count_tFilterRow_1++;

/**
 * [tFilterRow_1 main ] stop
 */
	
	/**
	 * [tFilterRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_begin ] stop
 */
// Start of branch "row13"
if(row13 != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row13"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
            int updateFlag_tDBOutput_2=0;
                    if(row13.value == null) {
pstmtUpdate_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_2.setLong(1, row13.value);
}


                    pstmtUpdate_tDBOutput_2.setInt(2 + count_tDBOutput_2, row13.id_country);


                    if(row13.id_year == null) {
pstmtUpdate_tDBOutput_2.setNull(3 + count_tDBOutput_2, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_2.setInt(3 + count_tDBOutput_2, row13.id_year);
}


                    if(row13.id_indicator == null) {
pstmtUpdate_tDBOutput_2.setNull(4 + count_tDBOutput_2, java.sql.Types.INTEGER);
} else {pstmtUpdate_tDBOutput_2.setInt(4 + count_tDBOutput_2, row13.id_indicator);
}


            try {
                updateFlag_tDBOutput_2=pstmtUpdate_tDBOutput_2.executeUpdate();
                updatedCount_tDBOutput_2 = updatedCount_tDBOutput_2+updateFlag_tDBOutput_2;
                rowsToCommitCount_tDBOutput_2 += updateFlag_tDBOutput_2;

            if(updateFlag_tDBOutput_2 == 0) {

                        pstmtInsert_tDBOutput_2.setInt(1, row13.id_country);

                        if(row13.value == null) {
pstmtInsert_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_2.setLong(2, row13.value);
}

                        if(row13.id_year == null) {
pstmtInsert_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_2.setInt(3, row13.id_year);
}

                        if(row13.id_indicator == null) {
pstmtInsert_tDBOutput_2.setNull(4, java.sql.Types.INTEGER);
} else {pstmtInsert_tDBOutput_2.setInt(4, row13.id_indicator);
}

                    int processedCount_tDBOutput_2 = pstmtInsert_tDBOutput_2.executeUpdate();
                    insertedCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    rowsToCommitCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    nb_line_tDBOutput_2++;
                }else{
                    nb_line_tDBOutput_2++;
             }
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_2 = true;
                        nb_line_tDBOutput_2++;
                            System.err.print(e.getMessage());
                }

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "row13"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */

} // End of branch "out3"




// Start of branch "out4"
if(out4 != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out4"
						
						);
					}
					
row16 = null;			
if(out4.indicator_loaded_info == null){
	finder_tUniqRow_1.indicator_loaded_info = null;
}else{
	finder_tUniqRow_1.indicator_loaded_info = out4.indicator_loaded_info.toLowerCase();
}	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
if(out4.indicator_loaded_info == null){
	new_tUniqRow_1.indicator_loaded_info = null;
}else{
	new_tUniqRow_1.indicator_loaded_info = out4.indicator_loaded_info.toLowerCase();
}
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row16 == null){ 
	
	row16 = new row16Struct();
}row16.indicator_loaded_info = out4.indicator_loaded_info;					
		nb_uniques_tUniqRow_1++;
	} else {
	  nb_duplicates_tUniqRow_1++;
	}

 


	tos_count_tUniqRow_1++;

/**
 * [tUniqRow_1 main ] stop
 */
	
	/**
	 * [tUniqRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_begin ] stop
 */
// Start of branch "row16"
if(row16 != null) { 



	
	/**
	 * [tFlowToIterate_5 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row16"
						
						);
					}
					


    	            
            globalMap.put("row16.indicator_loaded_info", row16.indicator_loaded_info);
    	
 
	   nb_line_tFlowToIterate_5++;  
       counter_tFlowToIterate_5++;
       globalMap.put("tFlowToIterate_5_CURRENT_ITERATION", counter_tFlowToIterate_5);
 


	tos_count_tFlowToIterate_5++;

/**
 * [tFlowToIterate_5 main ] stop
 */
	
	/**
	 * [tFlowToIterate_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_5";

	

 



/**
 * [tFlowToIterate_5 process_data_begin ] stop
 */
	NB_ITERATE_tJava_3++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate10", 1, "exec" + NB_ITERATE_tJava_3);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tJava_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_3", false);
		start_Hash.put("tJava_3", System.currentTimeMillis());
		
	
	currentComponent="tJava_3";

	
		int tos_count_tJava_3 = 0;
		


System.out.println(((String)globalMap.get("row16.indicator_loaded_info")));
 



/**
 * [tJava_3 begin ] stop
 */
	
	/**
	 * [tJava_3 main ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 


	tos_count_tJava_3++;

/**
 * [tJava_3 main ] stop
 */
	
	/**
	 * [tJava_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 process_data_begin ] stop
 */
	
	/**
	 * [tJava_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 process_data_end ] stop
 */
	
	/**
	 * [tJava_3 end ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 

ok_Hash.put("tJava_3", true);
end_Hash.put("tJava_3", System.currentTimeMillis());




/**
 * [tJava_3 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate10", 2, "exec" + NB_ITERATE_tJava_3);
						}				
					




	
	/**
	 * [tFlowToIterate_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_5";

	

 



/**
 * [tFlowToIterate_5 process_data_end ] stop
 */

} // End of branch "row16"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "out4"



	
		} // G_TM_M_250 close loop read file data '2'
	
	
	/**
	 * [tMap_8_TMAP_IN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	

 



/**
 * [tMap_8_TMAP_IN process_data_end ] stop
 */
	
	/**
	 * [tMap_8_TMAP_IN end ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	



// ###############################
// # Lookup hashes releasing
					fsi_tMap_8_2.endGet();
				
// ###############################      


 

ok_Hash.put("tMap_8_TMAP_IN", true);
end_Hash.put("tMap_8_TMAP_IN", System.currentTimeMillis());




/**
 * [tMap_8_TMAP_IN end ] stop
 */

	
	/**
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out3");
			  	}
			  	
 

ok_Hash.put("tFilterRow_1", true);
end_Hash.put("tFilterRow_1", System.currentTimeMillis());




/**
 * [tFilterRow_1 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



        if(pstmtUpdate_tDBOutput_2 != null){
            pstmtUpdate_tDBOutput_2.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_2");
        }
        if(pstmtInsert_tDBOutput_2 != null){
            pstmtInsert_tDBOutput_2.close();
            resourceMap.remove("pstmtInsert_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row13");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */







	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out4");
			  	}
			  	
 

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tFlowToIterate_5 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_5";

	

globalMap.put("tFlowToIterate_5_NB_LINE",nb_line_tFlowToIterate_5);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row16");
			  	}
			  	
 

ok_Hash.put("tFlowToIterate_5", true);
end_Hash.put("tFlowToIterate_5", System.currentTimeMillis());




/**
 * [tFlowToIterate_5 end ] stop
 */



























						if(execStat){
							runStat.updateStatOnConnection("iterate8", 2, "exec" + NB_ITERATE_tFileInputFullRow_1);
						}				
					




	
	/**
	 * [tJava_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 process_data_end ] stop
 */
	
	/**
	 * [tJava_2 end ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 

ok_Hash.put("tJava_2", true);
end_Hash.put("tJava_2", System.currentTimeMillis());




/**
 * [tJava_2 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate7", 2, "exec" + NB_ITERATE_tJava_2);
						}				
					




	
	/**
	 * [tLoop_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tLoop_2";

	

 



/**
 * [tLoop_2 process_data_end ] stop
 */
	
	/**
	 * [tLoop_2 end ] start
	 */

	

	
	
	currentComponent="tLoop_2";

	


	}


 

ok_Hash.put("tLoop_2", true);
end_Hash.put("tLoop_2", System.currentTimeMillis());




/**
 * [tLoop_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLoop_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tWarn_5Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLoop_2 finally ] start
	 */

	

	
	
	currentComponent="tLoop_2";

	

 



/**
 * [tLoop_2 finally ] stop
 */

	
	/**
	 * [tJava_2 finally ] start
	 */

	

	
	
	currentComponent="tJava_2";

	

 



/**
 * [tJava_2 finally ] stop
 */

	
	/**
	 * [tFileInputFullRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputFullRow_1";

	

 



/**
 * [tFileInputFullRow_1 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tMap_6_TMAP_OUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_OUT";

	

 



/**
 * [tMap_6_TMAP_OUT finally ] stop
 */

	
	/**
	 * [tMap_6_TMAP_IN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_6";
	
	currentComponent="tMap_6_TMAP_IN";

	

 



/**
 * [tMap_6_TMAP_IN finally ] stop
 */

	
	/**
	 * [tMap_7_TMAP_OUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_OUT";

	

 



/**
 * [tMap_7_TMAP_OUT finally ] stop
 */

	
	/**
	 * [tMap_7_TMAP_IN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_7";
	
	currentComponent="tMap_7_TMAP_IN";

	

 



/**
 * [tMap_7_TMAP_IN finally ] stop
 */

	
	/**
	 * [tMap_8_TMAP_OUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_OUT";

	

 



/**
 * [tMap_8_TMAP_OUT finally ] stop
 */

	
	/**
	 * [tMap_8_TMAP_IN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tMap_8";
	
	currentComponent="tMap_8_TMAP_IN";

	

 



/**
 * [tMap_8_TMAP_IN finally ] stop
 */

	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_2 = null;
                if ((pstmtUpdateToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_2")) != null) {
                    pstmtUpdateToClose_tDBOutput_2.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_2 = null;
                if ((pstmtInsertToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_2")) != null) {
                    pstmtInsertToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */







	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_5 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_5";

	

 



/**
 * [tFlowToIterate_5 finally ] stop
 */

	
	/**
	 * [tJava_3 finally ] start
	 */

	

	
	
	currentComponent="tJava_3";

	

 



/**
 * [tJava_3 finally ] stop
 */




































				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLoop_2_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_5", false);
		start_Hash.put("tWarn_5", System.currentTimeMillis());
		
	
	currentComponent="tWarn_5";

	
		int tos_count_tWarn_5 = 0;
		

 



/**
 * [tWarn_5 begin ] stop
 */
	
	/**
	 * [tWarn_5 main ] start
	 */

	

	
	
	currentComponent="tWarn_5";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_5", "", Thread.currentThread().getId() + "", "INFO","","Integration Other Indicator from CSV file to database : OK","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_5", 3, "Integration Other Indicator from CSV file to database : OK", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_5_WARN_MESSAGES", "Integration Other Indicator from CSV file to database : OK"); 
	globalMap.put("tWarn_5_WARN_PRIORITY", 3);
	globalMap.put("tWarn_5_WARN_CODE", 42);
	
} catch (Exception e_tWarn_5) {
globalMap.put("tWarn_5_ERROR_MESSAGE",e_tWarn_5.getMessage());
	logIgnoredError(String.format("tWarn_5 - tWarn failed to log message due to internal error: %s", e_tWarn_5), e_tWarn_5);
}


 


	tos_count_tWarn_5++;

/**
 * [tWarn_5 main ] stop
 */
	
	/**
	 * [tWarn_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_5";

	

 



/**
 * [tWarn_5 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_5";

	

 



/**
 * [tWarn_5 process_data_end ] stop
 */
	
	/**
	 * [tWarn_5 end ] start
	 */

	

	
	
	currentComponent="tWarn_5";

	

 

ok_Hash.put("tWarn_5", true);
end_Hash.put("tWarn_5", System.currentTimeMillis());




/**
 * [tWarn_5 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_5 finally ] start
	 */

	

	
	
	currentComponent="tWarn_5";

	

 



/**
 * [tWarn_5 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_5_SUBPROCESS_STATE", 1);
	}
	

public void tDie_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_3", false);
		start_Hash.put("tDie_3", System.currentTimeMillis());
		
	
	currentComponent="tDie_3";

	
		int tos_count_tDie_3 = 0;
		

 



/**
 * [tDie_3 begin ] stop
 */
	
	/**
	 * [tDie_3 main ] start
	 */

	

	
	
	currentComponent="tDie_3";

	

	try {
				tLogCatcher_2.addMessage("tDie", "tDie_3", 5, "Integration Other Indicator from CSV file to database : NOK", 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_3_DIE_PRIORITY", 5);
	System.err.println("Integration Other Indicator from CSV file to database : NOK");
	
	globalMap.put("tDie_3_DIE_MESSAGE", "Integration Other Indicator from CSV file to database : NOK");
	globalMap.put("tDie_3_DIE_MESSAGES", "Integration Other Indicator from CSV file to database : NOK");
	
	} catch (Exception | Error e_tDie_3) {
	    globalMap.put("tDie_3_ERROR_MESSAGE",e_tDie_3.getMessage());
		logIgnoredError(String.format("tDie_3 - tDie failed to log message due to internal error: %s", e_tDie_3), e_tDie_3);
	}
	
	currentComponent = "tDie_3";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_3_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_3++;

/**
 * [tDie_3 main ] stop
 */
	
	/**
	 * [tDie_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_3";

	

 



/**
 * [tDie_3 process_data_begin ] stop
 */
	
	/**
	 * [tDie_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_3";

	

 



/**
 * [tDie_3 process_data_end ] stop
 */
	
	/**
	 * [tDie_3 end ] start
	 */

	

	
	
	currentComponent="tDie_3";

	

 

ok_Hash.put("tDie_3", true);
end_Hash.put("tDie_3", System.currentTimeMillis());




/**
 * [tDie_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_3 finally ] start
	 */

	

	
	
	currentComponent="tDie_3";

	

 



/**
 * [tDie_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_3_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}
				
			    public String type;

				public String getType () {
					return this.type;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String message;

				public String getMessage () {
					return this.message;
				}
				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}
				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tLogCatcher_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLogCatcher_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tFileOutputDelimited_2 = 0;
		

String fileName_tFileOutputDelimited_2 = "";
    fileName_tFileOutputDelimited_2 = (new java.io.File(context.log_path+"errors_logs_"+TalendDate.getDate("DDMMYYYY")+".txt")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_2 = null;
    String extension_tFileOutputDelimited_2 = null;
    String directory_tFileOutputDelimited_2 = null;
    if((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        }
        directory_tFileOutputDelimited_2 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_2 = true;
    java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
    globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
        if(filetFileOutputDelimited_2.exists()){
            isFileGenerated_tFileOutputDelimited_2 = false;
        }
            int nb_line_tFileOutputDelimited_2 = 0;
            int splitedFileNo_tFileOutputDelimited_2 = 0;
            int currentRow_tFileOutputDelimited_2 = 0;

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */","/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
                        if(!dir_tFileOutputDelimited_2.exists()) {
                            dir_tFileOutputDelimited_2.mkdirs();
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_2, true),"ISO-8859-15"));
                                    if(filetFileOutputDelimited_2.length()==0){
                                        outtFileOutputDelimited_2.write("moment");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("job");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("type");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("message");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("code");
                                        outtFileOutputDelimited_2.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

 



/**
 * [tFileOutputDelimited_2 begin ] stop
 */



	
	/**
	 * [tLogCatcher_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogCatcher_2", false);
		start_Hash.put("tLogCatcher_2", System.currentTimeMillis());
		
	
	currentComponent="tLogCatcher_2";

	
		int tos_count_tLogCatcher_2 = 0;
		

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : tLogCatcher_2.getMessages()) {
		row4.type = lcm.getType();
		row4.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row4.priority = lcm.getPriority();
		row4.message = lcm.getMessage();
		row4.code = lcm.getCode();
		
		row4.moment = java.util.Calendar.getInstance().getTime();
	
    	row4.pid = pid;
		row4.root_pid = rootPid;
		row4.father_pid = fatherPid;
	
    	row4.project = projectName;
    	row4.job = jobName;
    	row4.context = contextStr;
    		
 



/**
 * [tLogCatcher_2 begin ] stop
 */
	
	/**
	 * [tLogCatcher_2 main ] start
	 */

	

	
	
	currentComponent="tLogCatcher_2";

	

 


	tos_count_tLogCatcher_2++;

/**
 * [tLogCatcher_2 main ] stop
 */
	
	/**
	 * [tLogCatcher_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogCatcher_2";

	

 



/**
 * [tLogCatcher_2 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                            if(row4.moment != null) {
                        sb_tFileOutputDelimited_2.append(
                            FormatterUtils.format_Date(row4.moment, "yyyy-MM-dd HH:mm:ss")
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row4.job != null) {
                        sb_tFileOutputDelimited_2.append(
                            row4.job
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row4.type != null) {
                        sb_tFileOutputDelimited_2.append(
                            row4.type
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row4.message != null) {
                        sb_tFileOutputDelimited_2.append(
                            row4.message
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row4.code != null) {
                        sb_tFileOutputDelimited_2.append(
                            row4.code
                        );
                            }
                    sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);


                    nb_line_tFileOutputDelimited_2++;
                    resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

                        outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());




 


	tos_count_tFileOutputDelimited_2++;

/**
 * [tFileOutputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_end ] stop
 */



	
	/**
	 * [tLogCatcher_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_2";

	

 



/**
 * [tLogCatcher_2 process_data_end ] stop
 */
	
	/**
	 * [tLogCatcher_2 end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_2";

	
	}
} catch (Exception e_tLogCatcher_2) {
globalMap.put("tLogCatcher_2_ERROR_MESSAGE",e_tLogCatcher_2.getMessage());
	logIgnoredError(String.format("tLogCatcher_2 - tLogCatcher failed to process log message(s) due to internal error: %s", e_tLogCatcher_2), e_tLogCatcher_2);
}

 

ok_Hash.put("tLogCatcher_2", true);
end_Hash.put("tLogCatcher_2", System.currentTimeMillis());




/**
 * [tLogCatcher_2 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	



		
			
					if(outtFileOutputDelimited_2!=null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}
				
				globalMap.put("tFileOutputDelimited_2_NB_LINE",nb_line_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_2", true);
	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tFileOutputDelimited_2", true);
end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLogCatcher_2 finally ] start
	 */

	

	
	
	currentComponent="tLogCatcher_2";

	

 



/**
 * [tLogCatcher_2 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	


		if(resourceMap.get("finish_tFileOutputDelimited_2") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_2");
						if(outtFileOutputDelimited_2!=null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLogCatcher_2_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}
				
			    public String type;

				public String getType () {
					return this.type;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String message;

				public String getMessage () {
					return this.message;
				}
				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}
				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tLogCatcher_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tFileOutputDelimited_1 = 0;
		

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File(context.log_path+"info_logs_"+TalendDate.getDate("DDMMYYYY")+".txt")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
        if(filetFileOutputDelimited_1.exists()){
            isFileGenerated_tFileOutputDelimited_1 = false;
        }
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                            dir_tFileOutputDelimited_1.mkdirs();
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, true),"ISO-8859-15"));
                                    if(filetFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("moment");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("job");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("type");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("message");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("code");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tLogCatcher_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogCatcher_1", false);
		start_Hash.put("tLogCatcher_1", System.currentTimeMillis());
		
	
	currentComponent="tLogCatcher_1";

	
		int tos_count_tLogCatcher_1 = 0;
		

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : tLogCatcher_1.getMessages()) {
		row3.type = lcm.getType();
		row3.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row3.priority = lcm.getPriority();
		row3.message = lcm.getMessage();
		row3.code = lcm.getCode();
		
		row3.moment = java.util.Calendar.getInstance().getTime();
	
    	row3.pid = pid;
		row3.root_pid = rootPid;
		row3.father_pid = fatherPid;
	
    	row3.project = projectName;
    	row3.job = jobName;
    	row3.context = contextStr;
    		
 



/**
 * [tLogCatcher_1 begin ] stop
 */
	
	/**
	 * [tLogCatcher_1 main ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 


	tos_count_tLogCatcher_1++;

/**
 * [tLogCatcher_1 main ] stop
 */
	
	/**
	 * [tLogCatcher_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(row3.moment != null) {
                        sb_tFileOutputDelimited_1.append(
                            FormatterUtils.format_Date(row3.moment, "yyyy-MM-dd HH:mm:ss")
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row3.job != null) {
                        sb_tFileOutputDelimited_1.append(
                            row3.job
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row3.type != null) {
                        sb_tFileOutputDelimited_1.append(
                            row3.type
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row3.message != null) {
                        sb_tFileOutputDelimited_1.append(
                            row3.message
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row3.code != null) {
                        sb_tFileOutputDelimited_1.append(
                            row3.code
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());




 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */



	
	/**
	 * [tLogCatcher_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 process_data_end ] stop
 */
	
	/**
	 * [tLogCatcher_1 end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	
	}
} catch (Exception e_tLogCatcher_1) {
globalMap.put("tLogCatcher_1_ERROR_MESSAGE",e_tLogCatcher_1.getMessage());
	logIgnoredError(String.format("tLogCatcher_1 - tLogCatcher failed to process log message(s) due to internal error: %s", e_tLogCatcher_1), e_tLogCatcher_1);
}

 

ok_Hash.put("tLogCatcher_1", true);
end_Hash.put("tLogCatcher_1", System.currentTimeMillis());




/**
 * [tLogCatcher_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLogCatcher_1 finally ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";

	

 



/**
 * [tLogCatcher_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.country_code == null) ? 0 : this.country_code.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row8Struct other = (row8Struct) obj;
		
						if (this.country_code == null) {
							if (other.country_code != null)
								return false;
						
						} else if (!this.country_code.equals(other.country_code))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.id = this.id;
	            other.country_code = this.country_code;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.country_code = this.country_code;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
			            this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id = objectIn.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",country_code="+country_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.country_code, other.country_code);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row8Struct row8 = new row8Struct();




	
	/**
	 * [tAdvancedHash_row8 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row8", false);
		start_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
					}
				
		int tos_count_tAdvancedHash_row8 = 0;
		

			   		// connection name:row8
			   		// source node:tDBInput_3 - inputs:(after_tJava_1) outputs:(row8,row8) | target node:tAdvancedHash_row8 - inputs:(row8) outputs:()
			   		// linked node: tMap_3 - inputs:(report,row8,country_data) outputs:(report_data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row8 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row8Struct>getLookup(matchingModeEnum_row8);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row8", tHash_Lookup_row8);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row8 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_3 = java.util.Calendar.getInstance();
		    calendar_tDBInput_3.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_3 = calendar_tDBInput_3.getTime();
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				conn_tDBInput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "select id, country_code from country";
		    

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row8.id = 0;
							} else {
		                          
            row8.id = rs_tDBInput_3.getInt(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row8.country_code = null;
							} else {
	                         		
        	row8.country_code = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
					

 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					


			   
			   

					row8Struct row8_HashRow = new row8Struct();
		   	   	   
				
				row8_HashRow.id = row8.id;
				
				row8_HashRow.country_code = row8.country_code;
				
			tHash_Lookup_row8.put(row8_HashRow);
			
            




 


	tos_count_tAdvancedHash_row8++;

/**
 * [tAdvancedHash_row8 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

	}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
}

		   globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
		


 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

tHash_Lookup_row8.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row8", true);
end_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());




/**
 * [tAdvancedHash_row8 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class country_dataStruct implements routines.system.IPersistableComparableLookupRow<country_dataStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public Integer row_number;

				public Integer getRow_number () {
					return this.row_number;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.row_number == null) ? 0 : this.row_number.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final country_dataStruct other = (country_dataStruct) obj;
		
						if (this.row_number == null) {
							if (other.row_number != null)
								return false;
						
						} else if (!this.row_number.equals(other.row_number))
						
							return false;
					

		return true;
    }

	public void copyDataTo(country_dataStruct other) {

		other.country_code = this.country_code;
	            other.row_number = this.row_number;
	            
	}

	public void copyKeysDataTo(country_dataStruct other) {

		other.row_number = this.row_number;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.country_code = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.country_code = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.country_code, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.country_code, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("country_code="+country_code);
		sb.append(",row_number="+String.valueOf(row_number));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(country_dataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.row_number, other.row_number);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("country_code="+country_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputExcel_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputExcel_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row7Struct row7 = new row7Struct();
country_dataStruct country_data = new country_dataStruct();





	
	/**
	 * [tAdvancedHash_country_data begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_country_data", false);
		start_Hash.put("tAdvancedHash_country_data", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_country_data";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"country_data");
					}
				
		int tos_count_tAdvancedHash_country_data = 0;
		

			   		// connection name:country_data
			   		// source node:tMap_2 - inputs:(row7) outputs:(country_data,country_data) | target node:tAdvancedHash_country_data - inputs:(country_data) outputs:()
			   		// linked node: tMap_3 - inputs:(report,row8,country_data) outputs:(report_data)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_country_data = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<country_dataStruct> tHash_Lookup_country_data =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<country_dataStruct>getLookup(matchingModeEnum_country_data);
	   						   
		   	   	   globalMap.put("tHash_Lookup_country_data", tHash_Lookup_country_data);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_country_data begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
country_dataStruct country_data_tmp = new country_dataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tFileInputExcel_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputExcel_3", false);
		start_Hash.put("tFileInputExcel_3", System.currentTimeMillis());
		
	
	currentComponent="tFileInputExcel_3";

	
		int tos_count_tFileInputExcel_3 = 0;
		

 
	final String decryptedPassword_tFileInputExcel_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:ml/PAcd1v4wOqV9ca4+1p2stlnwGQHvrlMHEYg==");
        String password_tFileInputExcel_3 = decryptedPassword_tFileInputExcel_3;
        if (password_tFileInputExcel_3.isEmpty()){
            password_tFileInputExcel_3 = null;
        }
			class RegexUtil_tFileInputExcel_3 {

		    	public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, String oneSheetName, boolean useRegex) {

			        java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();

			        if(useRegex){//this part process the regex issue

				        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(oneSheetName);
				        for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
				            String sheetName = sheet.getSheetName();
				            java.util.regex.Matcher matcher = pattern.matcher(sheetName);
				            if (matcher.matches()) {
				            	if(sheet != null){
				                	list.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet);
				                }
				            }
				        }

			        }else{
			        	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheet(oneSheetName);
		            	if(sheet != null){
		                	list.add(sheet);
		                }

			        }

			        return list;
			    }

			    public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, int index, boolean useRegex) {
			    	java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list =  new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
			    	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheetAt(index);
	            	if(sheet != null){
	                	list.add(sheet);
	                }
			    	return list;
			    }

			}
		RegexUtil_tFileInputExcel_3 regexUtil_tFileInputExcel_3 = new RegexUtil_tFileInputExcel_3();

		Object source_tFileInputExcel_3 = context.input_path+context.cpi_filename;
		org.apache.poi.xssf.usermodel.XSSFWorkbook workbook_tFileInputExcel_3 = null;

		if(source_tFileInputExcel_3 instanceof String){
			workbook_tFileInputExcel_3 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create(new java.io.File((String)source_tFileInputExcel_3), password_tFileInputExcel_3, true);
		} else if(source_tFileInputExcel_3 instanceof java.io.InputStream) {
     		workbook_tFileInputExcel_3 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create((java.io.InputStream)source_tFileInputExcel_3, password_tFileInputExcel_3);
		} else{
			workbook_tFileInputExcel_3 = null;
			throw new java.lang.Exception("The data source should be specified as Inputstream or File Path!");
		}
		try {

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_tFileInputExcel_3 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
        sheetList_tFileInputExcel_3.addAll(regexUtil_tFileInputExcel_3.getSheets(workbook_tFileInputExcel_3, 1, false));
    	if(sheetList_tFileInputExcel_3.size() <= 0){
            throw new RuntimeException("Special sheets not exist!");
        }

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_FilterNull_tFileInputExcel_3 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
		for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_FilterNull_tFileInputExcel_3 : sheetList_tFileInputExcel_3) {
			if(sheet_FilterNull_tFileInputExcel_3!=null && sheetList_FilterNull_tFileInputExcel_3.iterator()!=null && sheet_FilterNull_tFileInputExcel_3.iterator().hasNext()){
				sheetList_FilterNull_tFileInputExcel_3.add(sheet_FilterNull_tFileInputExcel_3);
			}
		}
		sheetList_tFileInputExcel_3 = sheetList_FilterNull_tFileInputExcel_3;
	if(sheetList_tFileInputExcel_3.size()>0){
		int nb_line_tFileInputExcel_3 = 0;

        int begin_line_tFileInputExcel_3 = 3;

        int footer_input_tFileInputExcel_3 = 0;

        int end_line_tFileInputExcel_3=0;
        for(org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_3:sheetList_tFileInputExcel_3){
			end_line_tFileInputExcel_3+=(sheet_tFileInputExcel_3.getLastRowNum()+1);
        }
        end_line_tFileInputExcel_3 -= footer_input_tFileInputExcel_3;
        int limit_tFileInputExcel_3 = -1;
        int start_column_tFileInputExcel_3 = 2-1;
        int end_column_tFileInputExcel_3 = -1;
        Integer lastColumn_tFileInputExcel_3 = 2;
        if(lastColumn_tFileInputExcel_3!=null){
        	end_column_tFileInputExcel_3 = lastColumn_tFileInputExcel_3.intValue();
        }

        org.apache.poi.xssf.usermodel.XSSFRow row_tFileInputExcel_3 = null;
        org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_3 = sheetList_tFileInputExcel_3.get(0);
        int rowCount_tFileInputExcel_3 = 0;
        int sheetIndex_tFileInputExcel_3 = 0;
        int currentRows_tFileInputExcel_3 = (sheetList_tFileInputExcel_3.get(0).getLastRowNum()+1);

		//for the number format
        java.text.DecimalFormat df_tFileInputExcel_3 = new java.text.DecimalFormat("#.####################################");
        char decimalChar_tFileInputExcel_3 = df_tFileInputExcel_3.getDecimalFormatSymbols().getDecimalSeparator();
		
        for(int i_tFileInputExcel_3 = begin_line_tFileInputExcel_3; i_tFileInputExcel_3 < end_line_tFileInputExcel_3; i_tFileInputExcel_3++){

        	int emptyColumnCount_tFileInputExcel_3 = 0;

        	if (limit_tFileInputExcel_3 != -1 && nb_line_tFileInputExcel_3 >= limit_tFileInputExcel_3) {
        		break;
        	}

            while (i_tFileInputExcel_3 >= rowCount_tFileInputExcel_3 + currentRows_tFileInputExcel_3) {
                rowCount_tFileInputExcel_3 += currentRows_tFileInputExcel_3;
                sheet_tFileInputExcel_3 = sheetList_tFileInputExcel_3.get(++sheetIndex_tFileInputExcel_3);
                currentRows_tFileInputExcel_3 = (sheet_tFileInputExcel_3.getLastRowNum()+1);
            }
            globalMap.put("tFileInputExcel_3_CURRENT_SHEET",sheet_tFileInputExcel_3.getSheetName());
            if (rowCount_tFileInputExcel_3 <= i_tFileInputExcel_3) {
                row_tFileInputExcel_3 = sheet_tFileInputExcel_3.getRow(i_tFileInputExcel_3 - rowCount_tFileInputExcel_3);
            }
		    row7 = null;
					int tempRowLength_tFileInputExcel_3 = 1;
				
				int columnIndex_tFileInputExcel_3 = 0;
			
			String[] temp_row_tFileInputExcel_3 = new String[tempRowLength_tFileInputExcel_3];
			int excel_end_column_tFileInputExcel_3;
			if(row_tFileInputExcel_3==null){
				excel_end_column_tFileInputExcel_3=0;
			}else{
				excel_end_column_tFileInputExcel_3=row_tFileInputExcel_3.getLastCellNum();
			}
			int actual_end_column_tFileInputExcel_3;
			if(end_column_tFileInputExcel_3 == -1){
				actual_end_column_tFileInputExcel_3 = excel_end_column_tFileInputExcel_3;
			}
			else{
				actual_end_column_tFileInputExcel_3 = end_column_tFileInputExcel_3 >	excel_end_column_tFileInputExcel_3 ? excel_end_column_tFileInputExcel_3 : end_column_tFileInputExcel_3;
			}
			org.apache.poi.ss.formula.eval.NumberEval ne_tFileInputExcel_3 = null;
			for(int i=0;i<tempRowLength_tFileInputExcel_3;i++){
				if(i + start_column_tFileInputExcel_3 < actual_end_column_tFileInputExcel_3){
					org.apache.poi.ss.usermodel.Cell cell_tFileInputExcel_3 = row_tFileInputExcel_3.getCell(i + start_column_tFileInputExcel_3);
					if(cell_tFileInputExcel_3!=null){
					switch (cell_tFileInputExcel_3.getCellType()) {
                        case STRING:
                            temp_row_tFileInputExcel_3[i] = cell_tFileInputExcel_3.getRichStringCellValue().getString();
                            break;
                        case NUMERIC:
                            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_3)) {
									temp_row_tFileInputExcel_3[i] =cell_tFileInputExcel_3.getDateCellValue().toString();
                            } else {
                                temp_row_tFileInputExcel_3[i] = df_tFileInputExcel_3.format(cell_tFileInputExcel_3.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            temp_row_tFileInputExcel_3[i] =String.valueOf(cell_tFileInputExcel_3.getBooleanCellValue());
                            break;
                        case FORMULA:
        					switch (cell_tFileInputExcel_3.getCachedFormulaResultType()) {
                                case STRING:
                                    temp_row_tFileInputExcel_3[i] = cell_tFileInputExcel_3.getRichStringCellValue().getString();
                                    break;
                                case NUMERIC:
                                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_3)) {
											temp_row_tFileInputExcel_3[i] =cell_tFileInputExcel_3.getDateCellValue().toString();
                                    } else {
	                                    ne_tFileInputExcel_3 = new org.apache.poi.ss.formula.eval.NumberEval(cell_tFileInputExcel_3.getNumericCellValue());
										temp_row_tFileInputExcel_3[i] = ne_tFileInputExcel_3.getStringValue();
                                    }
                                    break;
                                case BOOLEAN:
                                    temp_row_tFileInputExcel_3[i] =String.valueOf(cell_tFileInputExcel_3.getBooleanCellValue());
                                    break;
                                default:
                            		temp_row_tFileInputExcel_3[i] = "";
                            }
                            break;
                        default:
                            temp_row_tFileInputExcel_3[i] = "";
                        }
                	}
                	else{
                		temp_row_tFileInputExcel_3[i]="";
                	}

				}else{
					temp_row_tFileInputExcel_3[i]="";
				}
			}
			boolean whetherReject_tFileInputExcel_3 = false;
			row7 = new row7Struct();
			int curColNum_tFileInputExcel_3 = -1;
			String curColName_tFileInputExcel_3 = "";
			try{
							columnIndex_tFileInputExcel_3 = 0;
						
			if( temp_row_tFileInputExcel_3[columnIndex_tFileInputExcel_3].length() > 0) {
				curColNum_tFileInputExcel_3=columnIndex_tFileInputExcel_3 + start_column_tFileInputExcel_3 + 1;
				curColName_tFileInputExcel_3 = "country_code";

				row7.country_code = temp_row_tFileInputExcel_3[columnIndex_tFileInputExcel_3];
			}else{
				row7.country_code = null;
				emptyColumnCount_tFileInputExcel_3++;
			}

				nb_line_tFileInputExcel_3++;
				
			}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_3_ERROR_MESSAGE",e.getMessage());
			whetherReject_tFileInputExcel_3 = true;
					 System.err.println(e.getMessage());
					 row7 = null;
			}


		



 



/**
 * [tFileInputExcel_3 begin ] stop
 */
	
	/**
	 * [tFileInputExcel_3 main ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_3";

	

 


	tos_count_tFileInputExcel_3++;

/**
 * [tFileInputExcel_3 main ] stop
 */
	
	/**
	 * [tFileInputExcel_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_3";

	

 



/**
 * [tFileInputExcel_3 process_data_begin ] stop
 */
// Start of branch "row7"
if(row7 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

country_data = null;


// # Output table : 'country_data'
country_data_tmp.country_code = row7.country_code ;
country_data_tmp.row_number = Numeric.sequence("s2",1,1);
country_data = country_data_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "country_data"
if(country_data != null) { 



	
	/**
	 * [tAdvancedHash_country_data main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_country_data";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"country_data"
						
						);
					}
					


			   
			   

					country_dataStruct country_data_HashRow = new country_dataStruct();
		   	   	   
				
				country_data_HashRow.country_code = country_data.country_code;
				
				country_data_HashRow.row_number = country_data.row_number;
				
			tHash_Lookup_country_data.put(country_data_HashRow);
			
            




 


	tos_count_tAdvancedHash_country_data++;

/**
 * [tAdvancedHash_country_data main ] stop
 */
	
	/**
	 * [tAdvancedHash_country_data process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_country_data";

	

 



/**
 * [tAdvancedHash_country_data process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_country_data process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_country_data";

	

 



/**
 * [tAdvancedHash_country_data process_data_end ] stop
 */

} // End of branch "country_data"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row7"




	
	/**
	 * [tFileInputExcel_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_3";

	

 



/**
 * [tFileInputExcel_3 process_data_end ] stop
 */
	
	/**
	 * [tFileInputExcel_3 end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_3";

	

			}
			
			
			
			globalMap.put("tFileInputExcel_3_NB_LINE",nb_line_tFileInputExcel_3);
			
				}
			
		} finally { 
				
  				if(!(source_tFileInputExcel_3 instanceof java.io.InputStream)){
  					workbook_tFileInputExcel_3.getPackage().revert();
  				}
				
		}	
		

 

ok_Hash.put("tFileInputExcel_3", true);
end_Hash.put("tFileInputExcel_3", System.currentTimeMillis());




/**
 * [tFileInputExcel_3 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_country_data end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_country_data";

	

tHash_Lookup_country_data.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"country_data");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_country_data", true);
end_Hash.put("tAdvancedHash_country_data", System.currentTimeMillis());




/**
 * [tAdvancedHash_country_data end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputExcel_3 finally ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_3";

	

 



/**
 * [tFileInputExcel_3 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_country_data finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_country_data";

	

 



/**
 * [tAdvancedHash_country_data finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputExcel_3_SUBPROCESS_STATE", 1);
	}
	


public static class row12Struct implements routines.system.IPersistableComparableLookupRow<row12Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.country_code == null) ? 0 : this.country_code.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row12Struct other = (row12Struct) obj;
		
						if (this.country_code == null) {
							if (other.country_code != null)
								return false;
						
						} else if (!this.country_code.equals(other.country_code))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row12Struct other) {

		other.id = this.id;
	            other.country_code = this.country_code;
	            
	}

	public void copyKeysDataTo(row12Struct other) {

		other.country_code = this.country_code;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.country_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
			            this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id = objectIn.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",country_code="+country_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row12Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.country_code, other.country_code);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row12Struct row12 = new row12Struct();




	
	/**
	 * [tAdvancedHash_row12 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row12", false);
		start_Hash.put("tAdvancedHash_row12", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row12";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row12");
					}
				
		int tos_count_tAdvancedHash_row12 = 0;
		

			   		// connection name:row12
			   		// source node:tDBInput_4 - inputs:(after_tLoop_2) outputs:(row12,row12) | target node:tAdvancedHash_row12 - inputs:(row12) outputs:()
			   		// linked node: tMap_7 - inputs:(report_data_,row12) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row12 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
					org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row12Struct> tHash_Lookup_row12 = 
	   					new org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row12Struct>(matchingModeEnum_row12, "C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + pid +"_Lookup_row12_"
	   					, new org.talend.designer.components.persistent.IRowCreator() {
	   						public row12Struct createRowInstance() {
	   							return new row12Struct();
	   						}
	   					}
	   					
	   						, 2000000
	   					
	   					); 

	   				tHash_Lookup_row12.initPut();

		   	   	   globalMap.put("tHash_Lookup_row12", tHash_Lookup_row12);
		   	   	   
	   			
           

 



/**
 * [tAdvancedHash_row12 begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_4 = java.util.Calendar.getInstance();
		    calendar_tDBInput_4.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_4 = calendar_tDBInput_4.getTime();
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				conn_tDBInput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "select id,country_code from country";
		    

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								row12.id = 0;
							} else {
		                          
            row12.id = rs_tDBInput_4.getInt(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row12.country_code = null;
							} else {
	                         		
        	row12.country_code = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
					

 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row12 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row12";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row12"
						
						);
					}
					


			   
			   

					row12Struct row12_HashRow = tHash_Lookup_row12.getNextFreeRow();

	   			
				row12_HashRow.id = row12.id;
				
				row12_HashRow.country_code = row12.country_code;
				
			tHash_Lookup_row12.put(row12_HashRow);
			
            




 


	tos_count_tAdvancedHash_row12++;

/**
 * [tAdvancedHash_row12 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row12 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row12";

	

 



/**
 * [tAdvancedHash_row12 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row12 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row12";

	

 



/**
 * [tAdvancedHash_row12 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

	}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
}

		   globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
		


 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row12 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row12";

	

tHash_Lookup_row12.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row12");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row12", true);
end_Hash.put("tAdvancedHash_row12", System.currentTimeMillis());




/**
 * [tAdvancedHash_row12 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row12 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row12";

	

 



/**
 * [tAdvancedHash_row12 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class dataStruct implements routines.system.IPersistableComparableLookupRow<dataStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public String indicator_name;

				public String getIndicator_name () {
					return this.indicator_name;
				}
				
			    public String indicator_code;

				public String getIndicator_code () {
					return this.indicator_code;
				}
				
			    public Integer row_number;

				public Integer getRow_number () {
					return this.row_number;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.row_number == null) ? 0 : this.row_number.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final dataStruct other = (dataStruct) obj;
		
						if (this.row_number == null) {
							if (other.row_number != null)
								return false;
						
						} else if (!this.row_number.equals(other.row_number))
						
							return false;
					

		return true;
    }

	public void copyDataTo(dataStruct other) {

		other.country_name = this.country_name;
	            other.country_code = this.country_code;
	            other.indicator_name = this.indicator_name;
	            other.indicator_code = this.indicator_code;
	            other.row_number = this.row_number;
	            
	}

	public void copyKeysDataTo(dataStruct other) {

		other.row_number = this.row_number;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
						this.row_number = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.row_number,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.country_name = readString(dis,ois);
					
						this.country_code = readString(dis,ois);
					
						this.indicator_name = readString(dis,ois);
					
						this.indicator_code = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.country_name = readString(dis,objectIn);
					
						this.country_code = readString(dis,objectIn);
					
						this.indicator_name = readString(dis,objectIn);
					
						this.indicator_code = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.country_name, dos, oos);
					
						writeString(this.country_code, dos, oos);
					
						writeString(this.indicator_name, dos, oos);
					
						writeString(this.indicator_code, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.country_name, dos, objectOut);
					
						writeString(this.country_code, dos, objectOut);
					
						writeString(this.indicator_name, dos, objectOut);
					
						writeString(this.indicator_code, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("country_name="+country_name);
		sb.append(",country_code="+country_code);
		sb.append(",indicator_name="+indicator_name);
		sb.append(",indicator_code="+indicator_code);
		sb.append(",row_number="+String.valueOf(row_number));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(dataStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.row_number, other.row_number);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];

	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public String indicator_name;

				public String getIndicator_name () {
					return this.indicator_name;
				}
				
			    public String indicator_code;

				public String getIndicator_code () {
					return this.indicator_code;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.indicator_name = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.indicator_name = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.country_name,dos);
					
					// String
				
						writeString(this.country_code,dos);
					
					// String
				
						writeString(this.indicator_name,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.country_name,dos);
					
					// String
				
						writeString(this.country_code,dos);
					
					// String
				
						writeString(this.indicator_name,dos);
					
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("country_name="+country_name);
		sb.append(",country_code="+country_code);
		sb.append(",indicator_name="+indicator_name);
		sb.append(",indicator_code="+indicator_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row10Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row10Struct row10 = new row10Struct();
dataStruct data = new dataStruct();





	
	/**
	 * [tAdvancedHash_data begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_data", false);
		start_Hash.put("tAdvancedHash_data", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_data";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"data");
					}
				
		int tos_count_tAdvancedHash_data = 0;
		

			   		// connection name:data
			   		// source node:tMap_5 - inputs:(row10) outputs:(data,data) | target node:tAdvancedHash_data - inputs:(data) outputs:()
			   		// linked node: tMap_6 - inputs:(out1,data) outputs:(report_data_)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_data = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
					org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<dataStruct> tHash_Lookup_data = 
	   					new org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<dataStruct>(matchingModeEnum_data, "C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + pid +"_Lookup_data_"
	   					, new org.talend.designer.components.persistent.IRowCreator() {
	   						public dataStruct createRowInstance() {
	   							return new dataStruct();
	   						}
	   					}
	   					
	   						, 2000000
	   					
	   					); 

	   				tHash_Lookup_data.initPut();

		   	   	   globalMap.put("tHash_Lookup_data", tHash_Lookup_data);
		   	   	   
	   			
           

 



/**
 * [tAdvancedHash_data begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row10");
					}
				
		int tos_count_tMap_5 = 0;
		




// ###############################
// # Lookup's keys initialization
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
dataStruct data_tmp = new dataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				int footer_tFileInputDelimited_1 = 0;
				int totalLinetFileInputDelimited_1 = 0;
				int limittFileInputDelimited_1 = -1;
				int lastLinetFileInputDelimited_1 = -1;	
				
				char fieldSeparator_tFileInputDelimited_1[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_1 = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_1[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_1 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_1 = /** Start field tFileInputDelimited_1:FILENAME */context.input_path+context.other_indc_filename/** End field tFileInputDelimited_1:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_1 = null;
	
				try{
					
						String[] rowtFileInputDelimited_1=null;
						int currentLinetFileInputDelimited_1 = 0;
	        			int outputLinetFileInputDelimited_1 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0;
			if(footer_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_1, fieldSeparator_tFileInputDelimited_1[0], "ISO-8859-15");
							}else{
								csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_1),fieldSeparator_tFileInputDelimited_1[0], "ISO-8859-15");
		        			}
					
					
					csvReadertFileInputDelimited_1.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_1[0] != '\n') && (rowSeparator_tFileInputDelimited_1[0] != '\r') )
	        			csvReadertFileInputDelimited_1.setLineEnd(""+rowSeparator_tFileInputDelimited_1[0]);
						
	        				csvReadertFileInputDelimited_1.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_1.setEscapeChar(csvReadertFileInputDelimited_1.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_1 > 0){
						for(totalLinetFileInputDelimited_1=0;totalLinetFileInputDelimited_1 < 1; totalLinetFileInputDelimited_1++){
							csvReadertFileInputDelimited_1.readNext();
						}
						csvReadertFileInputDelimited_1.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_1.readNext()) {
							
								rowtFileInputDelimited_1=csvReadertFileInputDelimited_1.getValues();
								if(!(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_1++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_1 = totalLinetFileInputDelimited_1 - footer_tFileInputDelimited_1   < 0? 0 : totalLinetFileInputDelimited_1 - footer_tFileInputDelimited_1 ;
	            		if(lastLinetFileInputDelimited_1 > 0){
	                		lastLinetFileInputDelimited_1 = lastLinetFileInputDelimited_1 < lastLineTemptFileInputDelimited_1 ? lastLinetFileInputDelimited_1 : lastLineTemptFileInputDelimited_1; 
	            		}else {
	                		lastLinetFileInputDelimited_1 = lastLineTemptFileInputDelimited_1;
	            		}
	         
			          	csvReadertFileInputDelimited_1.close();
				        if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_1, fieldSeparator_tFileInputDelimited_1[0], "ISO-8859-15");
		        		}else{
							csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_1),fieldSeparator_tFileInputDelimited_1[0], "ISO-8859-15");
						}
						csvReadertFileInputDelimited_1.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_1[0] != '\n') && (rowSeparator_tFileInputDelimited_1[0] != '\r') )	
	        				csvReadertFileInputDelimited_1.setLineEnd(""+rowSeparator_tFileInputDelimited_1[0]);
						
							csvReadertFileInputDelimited_1.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_1.setEscapeChar(csvReadertFileInputDelimited_1.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_1 != 0){
			        	for(currentLinetFileInputDelimited_1=0;currentLinetFileInputDelimited_1 < 1;currentLinetFileInputDelimited_1++){
			        		csvReadertFileInputDelimited_1.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_1.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_1 != 0 && csvReadertFileInputDelimited_1!=null && csvReadertFileInputDelimited_1.readNext() ) { 
	        		rowstate_tFileInputDelimited_1.reset();
	        
		        	rowtFileInputDelimited_1=csvReadertFileInputDelimited_1.getValues();
		        	
					
	        			if(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_1++;
	            
		            if(lastLinetFileInputDelimited_1 > -1 && currentLinetFileInputDelimited_1 > lastLinetFileInputDelimited_1) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_1++;
	            	if (limittFileInputDelimited_1 > 0 && outputLinetFileInputDelimited_1 > limittFileInputDelimited_1) {
	                	break;
	            	}  
	                                                                      
					
	    							row10 = null;			
								
								boolean whetherReject_tFileInputDelimited_1 = false;
								row10 = new row10Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_1_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_1_ListType = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0])){//empty line when row separator is '\n'
					
							row10.country_name = null;
					
							row10.country_code = null;
					
							row10.indicator_name = null;
					
							row10.indicator_code = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_1 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_1 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row10.country_name = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row10.country_name = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row10.country_code = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row10.country_code = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row10.indicator_name = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row10.indicator_name = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row10.indicator_code = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row10.indicator_code = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_1.getException()!=null) {
										throw rowstate_tFileInputDelimited_1.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_1 = true;
        							
                							System.err.println(e.getMessage());
                							row10 = null;
                						
            							globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row10"
if(row10 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

data = null;


// # Output table : 'data'
data_tmp.country_name = row10.country_name ;
data_tmp.country_code = row10.country_code ;
data_tmp.indicator_name = row10.indicator_name ;
data_tmp.indicator_code = row10.indicator_code ;
data_tmp.row_number = Numeric.sequence("s4",1,1);
data = data_tmp;
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "data"
if(data != null) { 



	
	/**
	 * [tAdvancedHash_data main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_data";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"data"
						
						);
					}
					


			   
			   

					dataStruct data_HashRow = tHash_Lookup_data.getNextFreeRow();

	   			
				data_HashRow.country_name = data.country_name;
				
				data_HashRow.country_code = data.country_code;
				
				data_HashRow.indicator_name = data.indicator_name;
				
				data_HashRow.indicator_code = data.indicator_code;
				
				data_HashRow.row_number = data.row_number;
				
			tHash_Lookup_data.put(data_HashRow);
			
            




 


	tos_count_tAdvancedHash_data++;

/**
 * [tAdvancedHash_data main ] stop
 */
	
	/**
	 * [tAdvancedHash_data process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_data";

	

 



/**
 * [tAdvancedHash_data process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_data process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_data";

	

 



/**
 * [tAdvancedHash_data process_data_end ] stop
 */

} // End of branch "data"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "row10"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	


				nb_line_tFileInputDelimited_1++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_1 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_1!=null){
    					csvReadertFileInputDelimited_1.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_1!=null){
    				globalMap.put("tFileInputDelimited_1_NB_LINE",nb_line_tFileInputDelimited_1);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row10");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_data end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_data";

	

tHash_Lookup_data.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"data");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_data", true);
end_Hash.put("tAdvancedHash_data", System.currentTimeMillis());




/**
 * [tAdvancedHash_data end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_data finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_data";

	

 



/**
 * [tAdvancedHash_data finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	


public static class row11Struct implements routines.system.IPersistableComparableLookupRow<row11Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}
				
			    public String indicator_code;

				public String getIndicator_code () {
					return this.indicator_code;
				}
				
			    public Byte active_onreport;

				public Byte getActive_onreport () {
					return this.active_onreport;
				}
				
			    public String indicator;

				public String getIndicator () {
					return this.indicator;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.indicator_code == null) ? 0 : this.indicator_code.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row11Struct other = (row11Struct) obj;
		
						if (this.indicator_code == null) {
							if (other.indicator_code != null)
								return false;
						
						} else if (!this.indicator_code.equals(other.indicator_code))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.id = this.id;
	            other.indicator_code = this.indicator_code;
	            other.active_onreport = this.active_onreport;
	            other.indicator = this.indicator;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.indicator_code = this.indicator_code;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.indicator_code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
			            this.id = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = dis.readByte();
           				}
					
						this.indicator = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.id = objectIn.readInt();
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.active_onreport = null;
           				} else {
           			    	this.active_onreport = objectIn.readByte();
           				}
					
						this.indicator = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.id);
					
						if(this.active_onreport == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeByte(this.active_onreport);
		            	}
					
						writeString(this.indicator, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.id);
					
						if(this.active_onreport == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeByte(this.active_onreport);
		            	}
					
						writeString(this.indicator, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",indicator_code="+indicator_code);
		sb.append(",active_onreport="+String.valueOf(active_onreport));
		sb.append(",indicator="+indicator);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.indicator_code, other.indicator_code);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row11Struct row11 = new row11Struct();




	
	/**
	 * [tAdvancedHash_row11 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row11", false);
		start_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row11";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row11");
					}
				
		int tos_count_tAdvancedHash_row11 = 0;
		

			   		// connection name:row11
			   		// source node:tDBInput_5 - inputs:(after_tLoop_2) outputs:(row11,row11) | target node:tAdvancedHash_row11 - inputs:(row11) outputs:()
			   		// linked node: tMap_8 - inputs:(out2,row11,row15) outputs:(out3,out4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row11 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_MATCHES;
			   			
			   
					org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row11Struct> tHash_Lookup_row11 = 
	   					new org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row11Struct>(matchingModeEnum_row11, "C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + pid +"_Lookup_row11_"
	   					, new org.talend.designer.components.persistent.IRowCreator() {
	   						public row11Struct createRowInstance() {
	   							return new row11Struct();
	   						}
	   					}
	   					
	   						, 2000000
	   					
	   					); 

	   				tHash_Lookup_row11.initPut();

		   	   	   globalMap.put("tHash_Lookup_row11", tHash_Lookup_row11);
		   	   	   
	   			
           

 



/**
 * [tAdvancedHash_row11 begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_5 = java.util.Calendar.getInstance();
		    calendar_tDBInput_5.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_5 = calendar_tDBInput_5.getTime();
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				conn_tDBInput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "select id,indicator_code,active_onreport,indicator from indicator";
		    

            	globalMap.put("tDBInput_5_QUERY",dbquery_tDBInput_5);
		    java.sql.ResultSet rs_tDBInput_5 = null;

		    try {
		    	rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
		    	int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

		    String tmpContent_tDBInput_5 = null;
		    
		    
		    while (rs_tDBInput_5.next()) {
		        nb_line_tDBInput_5++;
		        
							if(colQtyInRs_tDBInput_5 < 1) {
								row11.id = 0;
							} else {
		                          
            row11.id = rs_tDBInput_5.getInt(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row11.indicator_code = null;
							} else {
	                         		
        	row11.indicator_code = routines.system.JDBCUtil.getString(rs_tDBInput_5, 2, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row11.active_onreport = null;
							} else {
		                          
            row11.active_onreport = rs_tDBInput_5.getByte(3);
            if(rs_tDBInput_5.wasNull()){
                    row11.active_onreport = null;
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row11.indicator = null;
							} else {
	                         		
        	row11.indicator = routines.system.JDBCUtil.getString(rs_tDBInput_5, 4, false);
		                    }
					

 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row11"
						
						);
					}
					


			   
			   

					row11Struct row11_HashRow = tHash_Lookup_row11.getNextFreeRow();

	   			
				row11_HashRow.id = row11.id;
				
				row11_HashRow.indicator_code = row11.indicator_code;
				
				row11_HashRow.active_onreport = row11.active_onreport;
				
				row11_HashRow.indicator = row11.indicator;
				
			tHash_Lookup_row11.put(row11_HashRow);
			
            




 


	tos_count_tAdvancedHash_row11++;

/**
 * [tAdvancedHash_row11 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

	}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
}

		   globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
		


 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

tHash_Lookup_row11.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row11");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row11", true);
end_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());




/**
 * [tAdvancedHash_row11 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

 



/**
 * [tAdvancedHash_row11 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row15Struct implements routines.system.IPersistableComparableLookupRow<row15Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s2_LoadData_4Report = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int id;

				public int getId () {
					return this.id;
				}
				
			    public String year;

				public String getYear () {
					return this.year;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row15Struct other = (row15Struct) obj;
		
						if (this.id != other.id)
							return false;
					

		return true;
    }

	public void copyDataTo(row15Struct other) {

		other.id = this.id;
	            other.year = this.year;
	            
	}

	public void copyKeysDataTo(row15Struct other) {

		other.id = this.id;
	            	
	}



	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s2_LoadData_4Report) {

        	try {

        		int length = 0;
		
			        this.id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.year = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.year = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.year, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.year, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("id="+String.valueOf(id));
		sb.append(",year="+year);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row15Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.id, other.id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row15Struct row15 = new row15Struct();




	
	/**
	 * [tAdvancedHash_row15 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row15", false);
		start_Hash.put("tAdvancedHash_row15", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row15";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row15");
					}
				
		int tos_count_tAdvancedHash_row15 = 0;
		

			   		// connection name:row15
			   		// source node:tDBInput_7 - inputs:(after_tLoop_2) outputs:(row15,row15) | target node:tAdvancedHash_row15 - inputs:(row15) outputs:()
			   		// linked node: tMap_8 - inputs:(out2,row11,row15) outputs:(out3,out4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row15 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
					org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row15Struct> tHash_Lookup_row15 = 
	   					new org.talend.designer.components.lookup.persistent.PersistentSortedLookupManager<row15Struct>(matchingModeEnum_row15, "C:/Program Files (x86)/TOS_DI-8.0.1/studio/workspace/temp" + "/"+ jobName +"_tMapData_" + pid +"_Lookup_row15_"
	   					, new org.talend.designer.components.persistent.IRowCreator() {
	   						public row15Struct createRowInstance() {
	   							return new row15Struct();
	   						}
	   					}
	   					
	   						, 2000000
	   					
	   					); 

	   				tHash_Lookup_row15.initPut();

		   	   	   globalMap.put("tHash_Lookup_row15", tHash_Lookup_row15);
		   	   	   
	   			
           

 



/**
 * [tAdvancedHash_row15 begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
	
	
		    java.util.Calendar calendar_tDBInput_7 = java.util.Calendar.getInstance();
		    calendar_tDBInput_7.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tDBInput_7 = calendar_tDBInput_7.getTime();
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				conn_tDBInput_7 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
				
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT * FROM year";
		    

            	globalMap.put("tDBInput_7_QUERY",dbquery_tDBInput_7);
		    java.sql.ResultSet rs_tDBInput_7 = null;

		    try {
		    	rs_tDBInput_7 = stmt_tDBInput_7.executeQuery(dbquery_tDBInput_7);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_7 = rs_tDBInput_7.getMetaData();
		    	int colQtyInRs_tDBInput_7 = rsmd_tDBInput_7.getColumnCount();

		    String tmpContent_tDBInput_7 = null;
		    
		    
		    while (rs_tDBInput_7.next()) {
		        nb_line_tDBInput_7++;
		        
							if(colQtyInRs_tDBInput_7 < 1) {
								row15.id = 0;
							} else {
		                          
            row15.id = rs_tDBInput_7.getInt(1);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row15.year = null;
							} else {
	                         		
        	row15.year = routines.system.JDBCUtil.getString(rs_tDBInput_7, 2, false);
		                    }
					

 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row15 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row15";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row15"
						
						);
					}
					


			   
			   

					row15Struct row15_HashRow = tHash_Lookup_row15.getNextFreeRow();

	   			
				row15_HashRow.id = row15.id;
				
				row15_HashRow.year = row15.year;
				
			tHash_Lookup_row15.put(row15_HashRow);
			
            




 


	tos_count_tAdvancedHash_row15++;

/**
 * [tAdvancedHash_row15 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row15 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row15";

	

 



/**
 * [tAdvancedHash_row15 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row15 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row15";

	

 



/**
 * [tAdvancedHash_row15 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

	}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
}

		   globalMap.put("tDBInput_7_NB_LINE",nb_line_tDBInput_7);
		


 

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row15 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row15";

	

tHash_Lookup_row15.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row15");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row15", true);
end_Hash.put("tAdvancedHash_row15", System.currentTimeMillis());




/**
 * [tAdvancedHash_row15 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row15 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row15";

	

 



/**
 * [tAdvancedHash_row15 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final s2_LoadData_4Report s2_LoadData_4ReportClass = new s2_LoadData_4Report();

        int exitCode = s2_LoadData_4ReportClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = s2_LoadData_4Report.class.getClassLoader().getResourceAsStream("local_project/s2_loaddata_4report_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = s2_LoadData_4Report.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("cpi_filename", "id_String");
                        if(context.getStringValue("cpi_filename") == null) {
                            context.cpi_filename = null;
                        } else {
                            context.cpi_filename=(String) context.getProperty("cpi_filename");
                        }
                        context.setContextType("other_indc_filename", "id_String");
                        if(context.getStringValue("other_indc_filename") == null) {
                            context.other_indc_filename = null;
                        } else {
                            context.other_indc_filename=(String) context.getProperty("other_indc_filename");
                        }
                        context.setContextType("db_host", "id_String");
                        if(context.getStringValue("db_host") == null) {
                            context.db_host = null;
                        } else {
                            context.db_host=(String) context.getProperty("db_host");
                        }
                        context.setContextType("db_port", "id_String");
                        if(context.getStringValue("db_port") == null) {
                            context.db_port = null;
                        } else {
                            context.db_port=(String) context.getProperty("db_port");
                        }
                        context.setContextType("db_pwd", "id_String");
                        if(context.getStringValue("db_pwd") == null) {
                            context.db_pwd = null;
                        } else {
                            context.db_pwd=(String) context.getProperty("db_pwd");
                        }
                        context.setContextType("db_user", "id_String");
                        if(context.getStringValue("db_user") == null) {
                            context.db_user = null;
                        } else {
                            context.db_user=(String) context.getProperty("db_user");
                        }
                        context.setContextType("db_name", "id_String");
                        if(context.getStringValue("db_name") == null) {
                            context.db_name = null;
                        } else {
                            context.db_name=(String) context.getProperty("db_name");
                        }
                        context.setContextType("input_path", "id_String");
                        if(context.getStringValue("input_path") == null) {
                            context.input_path = null;
                        } else {
                            context.input_path=(String) context.getProperty("input_path");
                        }
                        context.setContextType("log_path", "id_String");
                        if(context.getStringValue("log_path") == null) {
                            context.log_path = null;
                        } else {
                            context.log_path=(String) context.getProperty("log_path");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("cpi_filename")) {
                context.cpi_filename = (String) parentContextMap.get("cpi_filename");
            }if (parentContextMap.containsKey("other_indc_filename")) {
                context.other_indc_filename = (String) parentContextMap.get("other_indc_filename");
            }if (parentContextMap.containsKey("db_host")) {
                context.db_host = (String) parentContextMap.get("db_host");
            }if (parentContextMap.containsKey("db_port")) {
                context.db_port = (String) parentContextMap.get("db_port");
            }if (parentContextMap.containsKey("db_pwd")) {
                context.db_pwd = (String) parentContextMap.get("db_pwd");
            }if (parentContextMap.containsKey("db_user")) {
                context.db_user = (String) parentContextMap.get("db_user");
            }if (parentContextMap.containsKey("db_name")) {
                context.db_name = (String) parentContextMap.get("db_name");
            }if (parentContextMap.containsKey("input_path")) {
                context.input_path = (String) parentContextMap.get("input_path");
            }if (parentContextMap.containsKey("log_path")) {
                context.log_path = (String) parentContextMap.get("log_path");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob





this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tDBConnection_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBConnection_1) {
globalMap.put("tDBConnection_1_SUBPROCESS_STATE", -1);

e_tDBConnection_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : s2_LoadData_4Report");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     569779 characters generated by Talend Open Studio for Data Integration 
 *     on the 27 septembre 2023 à 23:29:19 EAT
 ************************************************************************************************/