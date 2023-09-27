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


package local_project.s1_loaddata_1shoot_0_1;

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
 





@SuppressWarnings("unused")

/**
 * Job: s1_LoadData_1Shoot Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class s1_LoadData_1Shoot implements TalendJob {

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
			
			if(year_filename != null){
				
					this.setProperty("year_filename", year_filename.toString());
				
			}
			
			if(indicator_filename != null){
				
					this.setProperty("indicator_filename", indicator_filename.toString());
				
			}
			
			if(country_filename != null){
				
					this.setProperty("country_filename", country_filename.toString());
				
			}
			
			if(country_filename2 != null){
				
					this.setProperty("country_filename2", country_filename2.toString());
				
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
public String year_filename;
public String getYear_filename(){
	return this.year_filename;
}
public String indicator_filename;
public String getIndicator_filename(){
	return this.indicator_filename;
}
public String country_filename;
public String getCountry_filename(){
	return this.country_filename;
}
public String country_filename2;
public String getCountry_filename2(){
	return this.country_filename2;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "s1_LoadData_1Shoot";
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

	LogCatcherUtils tLogCatcher_1 = new LogCatcherUtils();
	LogCatcherUtils tLogCatcher_2 = new LogCatcherUtils();

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
				s1_LoadData_1Shoot.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(s1_LoadData_1Shoot.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tNormalize_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tWarn_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputExcel_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputExcel_2_onSubJobError(exception, errorComponent, globalMap);
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
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
			public void tWarn_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_7_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError3", 0, "error");
						}
					
					errorCode = null;
					tDie_4Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tWarn_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputExcel_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_2", "", Thread.currentThread().getId() + "", "INFO","","Load year data from file to Database","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_2", 3, "Load year data from file to Database", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_2_WARN_MESSAGES", "Load year data from file to Database"); 
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
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tFileInputDelimited_1Process(globalMap); 
						



	
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
	


public static class years_dataStruct implements routines.system.IPersistableRow<years_dataStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.year,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
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
		sb.append("year="+year);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(years_dataStruct other) {

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

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.year,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
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
		sb.append("year="+year);
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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.year = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.year,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
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
		sb.append("year="+year);
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



		row1Struct row1 = new row1Struct();
row2Struct row2 = new row2Struct();
years_dataStruct years_data = new years_dataStruct();






	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"years_data");
					}
				
		int tos_count_tDBOutput_1 = 0;
		






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

String tableName_tDBOutput_1 = "year";
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
    	
            int rsTruncCountNumber_tDBOutput_1 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_1 = stmtTruncCount_tDBOutput_1.executeQuery("SELECT COUNT(1) FROM `" + tableName_tDBOutput_1 + "`")) {
                    if(rsTruncCount_tDBOutput_1.next()) {
                        rsTruncCountNumber_tDBOutput_1 = rsTruncCount_tDBOutput_1.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                stmtTrunc_tDBOutput_1.executeUpdate("TRUNCATE TABLE `" + tableName_tDBOutput_1 + "`");
                deletedCount_tDBOutput_1 += rsTruncCountNumber_tDBOutput_1;
            }

				String insert_tDBOutput_1 = "INSERT INTO `" + "year" + "` (`year`) VALUES (?)";
		        int batchSize_tDBOutput_1 = 100;
	   			int batchSizeCounter_tDBOutput_1=0;
		            
		        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
		        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);


 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
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
years_dataStruct years_data_tmp = new years_dataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tNormalize_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tNormalize_1", false);
		start_Hash.put("tNormalize_1", System.currentTimeMillis());
		
	
	currentComponent="tNormalize_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tNormalize_1 = 0;
		

	int lastNoEmptyIndex_tNormalize_1 = 0;
    int nb_line_tNormalize_1 = 0;
        String tmp_tNormalize_1 = null;
        StringBuilder currentRecord_tNormalize_1 = null;
        String [] normalizeRecord_tNormalize_1 = null;
        java.util.Set<String> recordSet_tNormalize_1 = new java.util.HashSet<String>();
        
				if ( ((String)",").length() == 0 ){
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				

 



/**
 * [tNormalize_1 begin ] stop
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
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = 1;
				try{
					
						Object filename_tFileInputDelimited_1 = context.input_path+context.year_filename;
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 1, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(context.input_path+context.year_filename, "ISO-8859-15",";","\n",true,0,1,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
								System.err.println(e.getMessage());
							
						}
					
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row1.year = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
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
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tNormalize_1 main ] start
	 */

	

	
	
	currentComponent="tNormalize_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

            normalizeRecord_tNormalize_1 = new String[1];
            if(row1.year != null) {
				if("".equals(row1.year)){
		        	normalizeRecord_tNormalize_1[0] = "";
		        }else{
	                
	                		normalizeRecord_tNormalize_1 = row1.year.split(",",-1);
	                        
                }           
            }
             		lastNoEmptyIndex_tNormalize_1=normalizeRecord_tNormalize_1.length;
	             	
            	
            	for(int i_tNormalize_1 = 0 ; i_tNormalize_1 < lastNoEmptyIndex_tNormalize_1 ; i_tNormalize_1++) {
		  			
	                currentRecord_tNormalize_1 = new StringBuilder();
	                nb_line_tNormalize_1++;               
	                
	                        	row2.year = normalizeRecord_tNormalize_1[i_tNormalize_1];
		                    

 


	tos_count_tNormalize_1++;

/**
 * [tNormalize_1 main ] stop
 */
	
	/**
	 * [tNormalize_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tNormalize_1";

	

 



/**
 * [tNormalize_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		
		              
			   	  		  if(
 				  		  			
 				  		  			(
 				  		  			
 				  		  			row2.year != null && row2.year.replace("\"","").matches("[0-9]{4}")
 				  		  			
 				  		  			)
  				  		  			
	  	  		  				) { // G_TM_M_280

							 // CALL close main tMap filter for table 'row2'
							// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

years_data = null;


// # Output table : 'years_data'
years_data_tmp.year = row2.year.replace("\"","");
years_data = years_data_tmp;
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
// Start of branch "years_data"
if(years_data != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"years_data"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                            if(years_data.year == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, years_data.year);
}

                    pstmt_tDBOutput_1.addBatch();
                    nb_line_tDBOutput_1++;

						
                      batchSizeCounter_tDBOutput_1++;
                if ( batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1) {
                try {
                        int countSum_tDBOutput_1 = 0;
                        for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
                            countSum_tDBOutput_1 += (countEach_tDBOutput_1 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
                        }
                        rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
                        insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                    int countSum_tDBOutput_1 = 0;
                    for(int countEach_tDBOutput_1: e.getUpdateCounts()) {
                        countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
                    }
                    rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
                    insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
                    System.err.println(e.getMessage());
                }

                batchSizeCounter_tDBOutput_1 = 0;
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

} // End of branch "years_data"



	
		} // G_TM_M_280 close main tMap filter for table 'row2'
	
	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */
		// end for
	}



	
	/**
	 * [tNormalize_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tNormalize_1";

	

 



/**
 * [tNormalize_1 process_data_end ] stop
 */

} // End of branch "row1"




	
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

	



            }
            }finally{
                if(!((Object)(context.input_path+context.year_filename) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
                }
			}
			  

 

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tNormalize_1 end ] start
	 */

	

	
	
	currentComponent="tNormalize_1";

	

    globalMap.put("tNormalize_1_NB_LINE", nb_line_tNormalize_1);
				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tNormalize_1", true);
end_Hash.put("tNormalize_1", System.currentTimeMillis());




/**
 * [tNormalize_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



                try {
                		if (batchSizeCounter_tDBOutput_1 != 0) {
							int countSum_tDBOutput_1 = 0;
							
							for(int countEach_tDBOutput_1: pstmt_tDBOutput_1.executeBatch()) {
								countSum_tDBOutput_1 += (countEach_tDBOutput_1 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
							}
							rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
							
	            	    	
	            	    		insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
	            	    	
            	    	}

                }catch (java.sql.BatchUpdateException e){
                    globalMap.put(currentComponent+"_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_1 = 0;
					for(int countEach_tDBOutput_1: e.getUpdateCounts()) {
						countSum_tDBOutput_1 += (countEach_tDBOutput_1 < 0 ? 0 : countEach_tDBOutput_1);
					}
					rowsToCommitCount_tDBOutput_1 += countSum_tDBOutput_1;
					
            	    insertedCount_tDBOutput_1 += countSum_tDBOutput_1;
	    	    	
                	System.err.println(e.getMessage());
                	
                }
                batchSizeCounter_tDBOutput_1 = 0;
    		
	

        if(pstmt_tDBOutput_1 != null) {
			
				pstmt_tDBOutput_1.close();
				resourceMap.remove("pstmt_tDBOutput_1");
			
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"years_data");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */









				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tWarn_3Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk6", 0, "ok");
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
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tNormalize_1 finally ] start
	 */

	

	
	
	currentComponent="tNormalize_1";

	

 



/**
 * [tNormalize_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
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
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
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
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_3", "", Thread.currentThread().getId() + "", "INFO","","Load year data from file to Database - OK","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_3", 3, "Load year data from file to Database - OK", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_3_WARN_MESSAGES", "Load year data from file to Database - OK"); 
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
				tLogCatcher_2.addMessage("tDie", "tDie_2", 5, "Load year data from file to Database  - NOK", 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_2_DIE_PRIORITY", 5);
	System.err.println("Load year data from file to Database  - NOK");
	
	globalMap.put("tDie_2_DIE_MESSAGE", "Load year data from file to Database  - NOK");
	globalMap.put("tDie_2_DIE_MESSAGES", "Load year data from file to Database  - NOK");
	
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
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_4", "", Thread.currentThread().getId() + "", "INFO","","Load indicator data from file to Database","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_4", 3, "Load indicator data from file to Database", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_4_WARN_MESSAGES", "Load indicator data from file to Database"); 
	globalMap.put("tWarn_4_WARN_PRIORITY", 3);
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
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tFileInputDelimited_2Process(globalMap); 
						



	
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
	


public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.indicator_name = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
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
		sb.append("indicator_name="+indicator_name);
		sb.append(",indicator_code="+indicator_code);
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

public static class indicator_dataStruct implements routines.system.IPersistableRow<indicator_dataStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.indicator_name = readString(dis);
					
					this.indicator_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
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
		sb.append("indicator_name="+indicator_name);
		sb.append(",indicator_code="+indicator_code);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(indicator_dataStruct other) {

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
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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
public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

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



		row5Struct row5 = new row5Struct();
indicator_dataStruct indicator_data = new indicator_dataStruct();
row6Struct row6 = new row6Struct();






	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tDBOutput_2 = 0;
		






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

String tableName_tDBOutput_2 = "indicator";
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
    	
            int rsTruncCountNumber_tDBOutput_2 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_2 = stmtTruncCount_tDBOutput_2.executeQuery("SELECT COUNT(1) FROM `" + tableName_tDBOutput_2 + "`")) {
                    if(rsTruncCount_tDBOutput_2.next()) {
                        rsTruncCountNumber_tDBOutput_2 = rsTruncCount_tDBOutput_2.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
                stmtTrunc_tDBOutput_2.executeUpdate("TRUNCATE TABLE `" + tableName_tDBOutput_2 + "`");
                deletedCount_tDBOutput_2 += rsTruncCountNumber_tDBOutput_2;
            }

				String insert_tDBOutput_2 = "INSERT INTO `" + "indicator" + "` (`indicator`,`indicator_code`) VALUES (?,?)";
		        int batchSize_tDBOutput_2 = 100;
	   			int batchSizeCounter_tDBOutput_2=0;
		            
		        java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
		        resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);


 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"indicator_data");
					}
				
		int tos_count_tUniqRow_1 = 0;
		

	
		class KeyStruct_tUniqRow_1 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String indicator_code;        
	        
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
				final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;
				
									if (this.indicator_code == null) {
										if (other.indicator_code != null) 
											return false;
								
									} else if (!this.indicator_code.equals(other.indicator_code))
								 
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
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
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
indicator_dataStruct indicator_data_tmp = new indicator_dataStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";

	
		int tos_count_tFileInputDelimited_2 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				int footer_tFileInputDelimited_2 = 0;
				int totalLinetFileInputDelimited_2 = 0;
				int limittFileInputDelimited_2 = -1;
				int lastLinetFileInputDelimited_2 = -1;	
				
				char fieldSeparator_tFileInputDelimited_2[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_2 = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_2[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_2 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_2 = /** Start field tFileInputDelimited_2:FILENAME */context.input_path+context.indicator_filename/** End field tFileInputDelimited_2:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_2 = null;
	
				try{
					
						String[] rowtFileInputDelimited_2=null;
						int currentLinetFileInputDelimited_2 = 0;
	        			int outputLinetFileInputDelimited_2 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0;
			if(footer_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_2, fieldSeparator_tFileInputDelimited_2[0], "ISO-8859-15");
							}else{
								csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_2),fieldSeparator_tFileInputDelimited_2[0], "ISO-8859-15");
		        			}
					
					
					csvReadertFileInputDelimited_2.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_2[0] != '\n') && (rowSeparator_tFileInputDelimited_2[0] != '\r') )
	        			csvReadertFileInputDelimited_2.setLineEnd(""+rowSeparator_tFileInputDelimited_2[0]);
						
	        				csvReadertFileInputDelimited_2.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_2.setEscapeChar(csvReadertFileInputDelimited_2.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_2 > 0){
						for(totalLinetFileInputDelimited_2=0;totalLinetFileInputDelimited_2 < 1; totalLinetFileInputDelimited_2++){
							csvReadertFileInputDelimited_2.readNext();
						}
						csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_2.readNext()) {
							
								rowtFileInputDelimited_2=csvReadertFileInputDelimited_2.getValues();
								if(!(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_2++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_2 = totalLinetFileInputDelimited_2 - footer_tFileInputDelimited_2   < 0? 0 : totalLinetFileInputDelimited_2 - footer_tFileInputDelimited_2 ;
	            		if(lastLinetFileInputDelimited_2 > 0){
	                		lastLinetFileInputDelimited_2 = lastLinetFileInputDelimited_2 < lastLineTemptFileInputDelimited_2 ? lastLinetFileInputDelimited_2 : lastLineTemptFileInputDelimited_2; 
	            		}else {
	                		lastLinetFileInputDelimited_2 = lastLineTemptFileInputDelimited_2;
	            		}
	         
			          	csvReadertFileInputDelimited_2.close();
				        if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_2, fieldSeparator_tFileInputDelimited_2[0], "ISO-8859-15");
		        		}else{
							csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_2),fieldSeparator_tFileInputDelimited_2[0], "ISO-8859-15");
						}
						csvReadertFileInputDelimited_2.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_2[0] != '\n') && (rowSeparator_tFileInputDelimited_2[0] != '\r') )	
	        				csvReadertFileInputDelimited_2.setLineEnd(""+rowSeparator_tFileInputDelimited_2[0]);
						
							csvReadertFileInputDelimited_2.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_2.setEscapeChar(csvReadertFileInputDelimited_2.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_2 != 0){
			        	for(currentLinetFileInputDelimited_2=0;currentLinetFileInputDelimited_2 < 1;currentLinetFileInputDelimited_2++){
			        		csvReadertFileInputDelimited_2.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_2 != 0 && csvReadertFileInputDelimited_2!=null && csvReadertFileInputDelimited_2.readNext() ) { 
	        		rowstate_tFileInputDelimited_2.reset();
	        
		        	rowtFileInputDelimited_2=csvReadertFileInputDelimited_2.getValues();
		        	
					
	        			if(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_2++;
	            
		            if(lastLinetFileInputDelimited_2 > -1 && currentLinetFileInputDelimited_2 > lastLinetFileInputDelimited_2) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_2++;
	            	if (limittFileInputDelimited_2 > 0 && outputLinetFileInputDelimited_2 > limittFileInputDelimited_2) {
	                	break;
	            	}  
	                                                                      
					
	    							row5 = null;			
								
								boolean whetherReject_tFileInputDelimited_2 = false;
								row5 = new row5Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_2_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_2_ListType = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0])){//empty line when row separator is '\n'
					
							row5.country_name = null;
					
							row5.country_code = null;
					
							row5.indicator_name = null;
					
							row5.indicator_code = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_2 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_2 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row5.country_name = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row5.country_name = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_2 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row5.country_code = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row5.country_code = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_2 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row5.indicator_name = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row5.indicator_name = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_2 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row5.indicator_code = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row5.indicator_code = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_2.getException()!=null) {
										throw rowstate_tFileInputDelimited_2.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_2 = true;
        							
                							System.err.println(e.getMessage());
                							row5 = null;
                						
            							globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_begin ] stop
 */
// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
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

indicator_data = null;


// # Output table : 'indicator_data'
indicator_data_tmp.indicator_name = row5.indicator_name ;
indicator_data_tmp.indicator_code = row5.indicator_code ;
indicator_data = indicator_data_tmp;
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
// Start of branch "indicator_data"
if(indicator_data != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"indicator_data"
						
						);
					}
					
row6 = null;			
if(indicator_data.indicator_code == null){
	finder_tUniqRow_1.indicator_code = null;
}else{
	finder_tUniqRow_1.indicator_code = indicator_data.indicator_code.toLowerCase();
}	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
if(indicator_data.indicator_code == null){
	new_tUniqRow_1.indicator_code = null;
}else{
	new_tUniqRow_1.indicator_code = indicator_data.indicator_code.toLowerCase();
}
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row6 == null){ 
	
	row6 = new row6Struct();
}row6.indicator_name = indicator_data.indicator_name;			row6.indicator_code = indicator_data.indicator_code;					
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
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                            if(row6.indicator_name == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, row6.indicator_name);
}

                            if(row6.indicator_code == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, row6.indicator_code);
}

                    pstmt_tDBOutput_2.addBatch();
                    nb_line_tDBOutput_2++;

						
                      batchSizeCounter_tDBOutput_2++;
            if(!whetherReject_tDBOutput_2) {
            }
                if ( batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2) {
                try {
                        int countSum_tDBOutput_2 = 0;
                        for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
                            countSum_tDBOutput_2 += (countEach_tDBOutput_2 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
                        }
                        rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
                        insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
                    int countSum_tDBOutput_2 = 0;
                    for(int countEach_tDBOutput_2: e.getUpdateCounts()) {
                        countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
                    }
                    rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
                    insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
                    System.err.println(e.getMessage());
                }

                batchSizeCounter_tDBOutput_2 = 0;
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

} // End of branch "row6"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "indicator_data"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFileInputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	


				nb_line_tFileInputDelimited_2++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_2 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_2!=null){
    					csvReadertFileInputDelimited_2.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_2!=null){
    				globalMap.put("tFileInputDelimited_2_NB_LINE",nb_line_tFileInputDelimited_2);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"indicator_data");
			  	}
			  	
 

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



                try {
                		if (batchSizeCounter_tDBOutput_2 != 0) {
							int countSum_tDBOutput_2 = 0;
							
							for(int countEach_tDBOutput_2: pstmt_tDBOutput_2.executeBatch()) {
								countSum_tDBOutput_2 += (countEach_tDBOutput_2 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
							}
							rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
							
	            	    	
	            	    		insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
	            	    	
            	    	}

                }catch (java.sql.BatchUpdateException e){
                    globalMap.put(currentComponent+"_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_2 = 0;
					for(int countEach_tDBOutput_2: e.getUpdateCounts()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;
					
            	    insertedCount_tDBOutput_2 += countSum_tDBOutput_2;
	    	    	
                	System.err.println(e.getMessage());
                	
                }
                batchSizeCounter_tDBOutput_2 = 0;
    		
	

        if(pstmt_tDBOutput_2 != null) {
			
				pstmt_tDBOutput_2.close();
				resourceMap.remove("pstmt_tDBOutput_2");
			
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBRow_1Process(globalMap);



/**
 * [tDBOutput_2 end ] stop
 */









				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_2:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
								} 
							
							tWarn_5Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_2:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk11", 0, "ok");
								} 
							
							tWarn_7Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";

	

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_1_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_1", false);
		start_Hash.put("tDBRow_1", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_1";

	
		int tos_count_tDBRow_1 = 0;
		

	java.sql.Connection conn_tDBRow_1 = null;
	String query_tDBRow_1 = "";
	boolean whetherReject_tDBRow_1 = false;
				conn_tDBRow_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
			
        resourceMap.put("conn_tDBRow_1", conn_tDBRow_1);
        java.sql.Statement stmt_tDBRow_1 = conn_tDBRow_1.createStatement();
        resourceMap.put("stmt_tDBRow_1", stmt_tDBRow_1);

 



/**
 * [tDBRow_1 begin ] stop
 */
	
	/**
	 * [tDBRow_1 main ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

query_tDBRow_1 = "INSERT INTO indicator (indicator,active_onreport) values('Corruption Perceptions Index',1)";
whetherReject_tDBRow_1 = false;
globalMap.put("tDBRow_1_QUERY",query_tDBRow_1);
try {
		stmt_tDBRow_1.execute(query_tDBRow_1);
		
	} catch (java.lang.Exception e) {
		whetherReject_tDBRow_1 = true;
		
				System.err.print(e.getMessage());
				globalMap.put("tDBRow_1_ERROR_MESSAGE", e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_1) {
		
	}
	

 


	tos_count_tDBRow_1++;

/**
 * [tDBRow_1 main ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

 



/**
 * [tDBRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

 



/**
 * [tDBRow_1 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_1 end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

	
        stmt_tDBRow_1.close();
        resourceMap.remove("stmt_tDBRow_1");
    resourceMap.put("statementClosed_tDBRow_1", true);
    resourceMap.put("finish_tDBRow_1", true);
 

ok_Hash.put("tDBRow_1", true);
end_Hash.put("tDBRow_1", System.currentTimeMillis());




/**
 * [tDBRow_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk14", 0, "ok");
								} 
							
							tDBRow_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

    if (resourceMap.get("statementClosed_tDBRow_1") == null) {
            java.sql.Statement stmtToClose_tDBRow_1 = null;
            if ((stmtToClose_tDBRow_1 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_1")) != null) {
                stmtToClose_tDBRow_1.close();
            }
    }
 



/**
 * [tDBRow_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_2_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_2", false);
		start_Hash.put("tDBRow_2", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_2";

	
		int tos_count_tDBRow_2 = 0;
		

	java.sql.Connection conn_tDBRow_2 = null;
	String query_tDBRow_2 = "";
	boolean whetherReject_tDBRow_2 = false;
				conn_tDBRow_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
			
        resourceMap.put("conn_tDBRow_2", conn_tDBRow_2);
        java.sql.Statement stmt_tDBRow_2 = conn_tDBRow_2.createStatement();
        resourceMap.put("stmt_tDBRow_2", stmt_tDBRow_2);

 



/**
 * [tDBRow_2 begin ] stop
 */
	
	/**
	 * [tDBRow_2 main ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

query_tDBRow_2 = "UPDATE indicator SET active_onreport = 1 WHERE id IN (60,367,923,1269,1362,1378,1478);";
whetherReject_tDBRow_2 = false;
globalMap.put("tDBRow_2_QUERY",query_tDBRow_2);
try {
		stmt_tDBRow_2.execute(query_tDBRow_2);
		
	} catch (java.lang.Exception e) {
		whetherReject_tDBRow_2 = true;
		
				System.err.print(e.getMessage());
				globalMap.put("tDBRow_2_ERROR_MESSAGE", e.getMessage());
				
	}
	

 


	tos_count_tDBRow_2++;

/**
 * [tDBRow_2 main ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

 



/**
 * [tDBRow_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

 



/**
 * [tDBRow_2 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_2 end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

	
        stmt_tDBRow_2.close();
        resourceMap.remove("stmt_tDBRow_2");
    resourceMap.put("statementClosed_tDBRow_2", true);
    resourceMap.put("finish_tDBRow_2", true);
 

ok_Hash.put("tDBRow_2", true);
end_Hash.put("tDBRow_2", System.currentTimeMillis());




/**
 * [tDBRow_2 end ] stop
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
	 * [tDBRow_2 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

    if (resourceMap.get("statementClosed_tDBRow_2") == null) {
            java.sql.Statement stmtToClose_tDBRow_2 = null;
            if ((stmtToClose_tDBRow_2 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_2")) != null) {
                stmtToClose_tDBRow_2.close();
            }
    }
 



/**
 * [tDBRow_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_2_SUBPROCESS_STATE", 1);
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
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_5", "", Thread.currentThread().getId() + "", "INFO","","Load year data from file to Database - OK","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_5", 3, "Load year data from file to Database - OK", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_5_WARN_MESSAGES", "Load year data from file to Database - OK"); 
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
				tLogCatcher_2.addMessage("tDie", "tDie_3", 5, "Load year data from file to Database  - NOK", 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_3_DIE_PRIORITY", 5);
	System.err.println("Load year data from file to Database  - NOK");
	
	globalMap.put("tDie_3_DIE_MESSAGE", "Load year data from file to Database  - NOK");
	globalMap.put("tDie_3_DIE_MESSAGES", "Load year data from file to Database  - NOK");
	
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
	

public void tWarn_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_7_SUBPROCESS_STATE", 0);

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
	 * [tWarn_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_7", false);
		start_Hash.put("tWarn_7", System.currentTimeMillis());
		
	
	currentComponent="tWarn_7";

	
		int tos_count_tWarn_7 = 0;
		

 



/**
 * [tWarn_7 begin ] stop
 */
	
	/**
	 * [tWarn_7 main ] start
	 */

	

	
	
	currentComponent="tWarn_7";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_7", "", Thread.currentThread().getId() + "", "INFO","","Load country data from file to Database","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_7", 3, "Load country data from file to Database", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_7_WARN_MESSAGES", "Load country data from file to Database"); 
	globalMap.put("tWarn_7_WARN_PRIORITY", 3);
	globalMap.put("tWarn_7_WARN_CODE", 42);
	
} catch (Exception e_tWarn_7) {
globalMap.put("tWarn_7_ERROR_MESSAGE",e_tWarn_7.getMessage());
	logIgnoredError(String.format("tWarn_7 - tWarn failed to log message due to internal error: %s", e_tWarn_7), e_tWarn_7);
}


 


	tos_count_tWarn_7++;

/**
 * [tWarn_7 main ] stop
 */
	
	/**
	 * [tWarn_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_7";

	

 



/**
 * [tWarn_7 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_7";

	

 



/**
 * [tWarn_7 process_data_end ] stop
 */
	
	/**
	 * [tWarn_7 end ] start
	 */

	

	
	
	currentComponent="tWarn_7";

	

 

ok_Hash.put("tWarn_7", true);
end_Hash.put("tWarn_7", System.currentTimeMillis());




/**
 * [tWarn_7 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tWarn_7:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tFileInputDelimited_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_7 finally ] start
	 */

	

	
	
	currentComponent="tWarn_7";

	

 



/**
 * [tWarn_7 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_7_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
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
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

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

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
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
public void tFileInputDelimited_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 0);

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
row8Struct row8 = new row8Struct();





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
					}
				
		int tos_count_tDBOutput_3 = 0;
		





        int updateKeyCount_tDBOutput_3 = 1;
        if(updateKeyCount_tDBOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_3 == 2 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_3 = 0;
int nb_line_update_tDBOutput_3 = 0;
int nb_line_inserted_tDBOutput_3 = 0;
int nb_line_deleted_tDBOutput_3 = 0;
int nb_line_rejected_tDBOutput_3 = 0;

int deletedCount_tDBOutput_3=0;
int updatedCount_tDBOutput_3=0;
int insertedCount_tDBOutput_3=0;
int rowsToCommitCount_tDBOutput_3=0;
int rejectedCount_tDBOutput_3=0;

String tableName_tDBOutput_3 = "country";
boolean whetherReject_tDBOutput_3 = false;

java.util.Calendar calendar_tDBOutput_3 = java.util.Calendar.getInstance();
calendar_tDBOutput_3.set(1, 0, 1, 0, 0, 0);
long year1_tDBOutput_3 = calendar_tDBOutput_3.getTime().getTime();
calendar_tDBOutput_3.set(10000, 0, 1, 0, 0, 0);
long year10000_tDBOutput_3 = calendar_tDBOutput_3.getTime().getTime();
long date_tDBOutput_3;

java.sql.Connection conn_tDBOutput_3 = null;
	conn_tDBOutput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	

int count_tDBOutput_3=0;
    	
            int rsTruncCountNumber_tDBOutput_3 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_3 = conn_tDBOutput_3.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_3 = stmtTruncCount_tDBOutput_3.executeQuery("SELECT COUNT(1) FROM `" + tableName_tDBOutput_3 + "`")) {
                    if(rsTruncCount_tDBOutput_3.next()) {
                        rsTruncCountNumber_tDBOutput_3 = rsTruncCount_tDBOutput_3.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_3 = conn_tDBOutput_3.createStatement()) {
                stmtTrunc_tDBOutput_3.executeUpdate("TRUNCATE TABLE `" + tableName_tDBOutput_3 + "`");
                deletedCount_tDBOutput_3 += rsTruncCountNumber_tDBOutput_3;
            }
	    String update_tDBOutput_3 = "UPDATE `" + "country" + "` SET `country` = ? WHERE `country_code` = ?";
	    
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(update_tDBOutput_3);
	    resourceMap.put("pstmtUpdate_tDBOutput_3", pstmtUpdate_tDBOutput_3);
	    String insert_tDBOutput_3 = "INSERT INTO `" + "country" + "` (`country`,`country_code`) VALUES (?,?)";
	         
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(insert_tDBOutput_3);
	    resourceMap.put("pstmtInsert_tDBOutput_3", pstmtInsert_tDBOutput_3);
	    

 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tUniqRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_2", false);
		start_Hash.put("tUniqRow_2", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tUniqRow_2 = 0;
		

	
		class KeyStruct_tUniqRow_2 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String country_code;        
	        
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
				final KeyStruct_tUniqRow_2 other = (KeyStruct_tUniqRow_2) obj;
				
									if (this.country_code == null) {
										if (other.country_code != null) 
											return false;
								
									} else if (!this.country_code.equals(other.country_code))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_2 = 0;
int nb_duplicates_tUniqRow_2 = 0;
KeyStruct_tUniqRow_2 finder_tUniqRow_2 = new KeyStruct_tUniqRow_2();
java.util.Set<KeyStruct_tUniqRow_2> keystUniqRow_2 = new java.util.HashSet<KeyStruct_tUniqRow_2>(); 

 



/**
 * [tUniqRow_2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_3", false);
		start_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_3";

	
		int tos_count_tFileInputDelimited_3 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_3 = 0;
				int footer_tFileInputDelimited_3 = 0;
				int totalLinetFileInputDelimited_3 = 0;
				int limittFileInputDelimited_3 = -1;
				int lastLinetFileInputDelimited_3 = -1;	
				
				char fieldSeparator_tFileInputDelimited_3[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_3 = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_3[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_3 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_3 = /** Start field tFileInputDelimited_3:FILENAME */context.input_path+context.country_filename2/** End field tFileInputDelimited_3:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_3 = null;
	
				try{
					
						String[] rowtFileInputDelimited_3=null;
						int currentLinetFileInputDelimited_3 = 0;
	        			int outputLinetFileInputDelimited_3 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_3 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_3 = 0;
			if(footer_value_tFileInputDelimited_3 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_3, fieldSeparator_tFileInputDelimited_3[0], "ISO-8859-15");
							}else{
								csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_3),fieldSeparator_tFileInputDelimited_3[0], "ISO-8859-15");
		        			}
					
					
					csvReadertFileInputDelimited_3.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_3[0] != '\n') && (rowSeparator_tFileInputDelimited_3[0] != '\r') )
	        			csvReadertFileInputDelimited_3.setLineEnd(""+rowSeparator_tFileInputDelimited_3[0]);
						
	        				csvReadertFileInputDelimited_3.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_3.setEscapeChar(csvReadertFileInputDelimited_3.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_3 > 0){
						for(totalLinetFileInputDelimited_3=0;totalLinetFileInputDelimited_3 < 1; totalLinetFileInputDelimited_3++){
							csvReadertFileInputDelimited_3.readNext();
						}
						csvReadertFileInputDelimited_3.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_3.readNext()) {
							
								rowtFileInputDelimited_3=csvReadertFileInputDelimited_3.getValues();
								if(!(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_3++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_3 = totalLinetFileInputDelimited_3 - footer_tFileInputDelimited_3   < 0? 0 : totalLinetFileInputDelimited_3 - footer_tFileInputDelimited_3 ;
	            		if(lastLinetFileInputDelimited_3 > 0){
	                		lastLinetFileInputDelimited_3 = lastLinetFileInputDelimited_3 < lastLineTemptFileInputDelimited_3 ? lastLinetFileInputDelimited_3 : lastLineTemptFileInputDelimited_3; 
	            		}else {
	                		lastLinetFileInputDelimited_3 = lastLineTemptFileInputDelimited_3;
	            		}
	         
			          	csvReadertFileInputDelimited_3.close();
				        if(filename_tFileInputDelimited_3 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_3, fieldSeparator_tFileInputDelimited_3[0], "ISO-8859-15");
		        		}else{
							csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_3),fieldSeparator_tFileInputDelimited_3[0], "ISO-8859-15");
						}
						csvReadertFileInputDelimited_3.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_3[0] != '\n') && (rowSeparator_tFileInputDelimited_3[0] != '\r') )	
	        				csvReadertFileInputDelimited_3.setLineEnd(""+rowSeparator_tFileInputDelimited_3[0]);
						
							csvReadertFileInputDelimited_3.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_3.setEscapeChar(csvReadertFileInputDelimited_3.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_3 != 0){
			        	for(currentLinetFileInputDelimited_3=0;currentLinetFileInputDelimited_3 < 1;currentLinetFileInputDelimited_3++){
			        		csvReadertFileInputDelimited_3.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_3.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_3 != 0 && csvReadertFileInputDelimited_3!=null && csvReadertFileInputDelimited_3.readNext() ) { 
	        		rowstate_tFileInputDelimited_3.reset();
	        
		        	rowtFileInputDelimited_3=csvReadertFileInputDelimited_3.getValues();
		        	
					
	        			if(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_3++;
	            
		            if(lastLinetFileInputDelimited_3 > -1 && currentLinetFileInputDelimited_3 > lastLinetFileInputDelimited_3) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_3++;
	            	if (limittFileInputDelimited_3 > 0 && outputLinetFileInputDelimited_3 > limittFileInputDelimited_3) {
	                	break;
	            	}  
	                                                                      
					
	    							row7 = null;			
								
								boolean whetherReject_tFileInputDelimited_3 = false;
								row7 = new row7Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_3_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)",").length() > 0 ){
					fieldSeparator_tFileInputDelimited_3_ListType = ((String)",").toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0])){//empty line when row separator is '\n'
					
							row7.country_name = null;
					
							row7.country_code = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_3 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_3 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
									row7.country_name = rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3];
									
							
						
						}else{
						
							
								row7.country_name = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_3 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
									row7.country_code = rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3];
									
							
						
						}else{
						
							
								row7.country_code = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_3.getException()!=null) {
										throw rowstate_tFileInputDelimited_3.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_3 = true;
        							
                							System.err.println(e.getMessage());
                							row7 = null;
                						
            							globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_3 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 


	tos_count_tFileInputDelimited_3++;

/**
 * [tFileInputDelimited_3 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 process_data_begin ] stop
 */
// Start of branch "row7"
if(row7 != null) { 



	
	/**
	 * [tUniqRow_2 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					
row8 = null;			
if(row7.country_code == null){
	finder_tUniqRow_2.country_code = null;
}else{
	finder_tUniqRow_2.country_code = row7.country_code.toLowerCase();
}	
finder_tUniqRow_2.hashCodeDirty = true;
if (!keystUniqRow_2.contains(finder_tUniqRow_2)) {
		KeyStruct_tUniqRow_2 new_tUniqRow_2 = new KeyStruct_tUniqRow_2();

		
if(row7.country_code == null){
	new_tUniqRow_2.country_code = null;
}else{
	new_tUniqRow_2.country_code = row7.country_code.toLowerCase();
}
		
		keystUniqRow_2.add(new_tUniqRow_2);if(row8 == null){ 
	
	row8 = new row8Struct();
}row8.country_name = row7.country_name;			row8.country_code = row7.country_code;					
		nb_uniques_tUniqRow_2++;
	} else {
	  nb_duplicates_tUniqRow_2++;
	}

 


	tos_count_tUniqRow_2++;

/**
 * [tUniqRow_2 main ] stop
 */
	
	/**
	 * [tUniqRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_2";

	

 



/**
 * [tUniqRow_2 process_data_begin ] stop
 */
// Start of branch "row8"
if(row8 != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					



        whetherReject_tDBOutput_3 = false;
            int updateFlag_tDBOutput_3=0;
                    if(row8.country_name == null) {
pstmtUpdate_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(1, row8.country_name);
}


                    if(row8.country_code == null) {
pstmtUpdate_tDBOutput_3.setNull(2 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(2 + count_tDBOutput_3, row8.country_code);
}


            try {
                updateFlag_tDBOutput_3=pstmtUpdate_tDBOutput_3.executeUpdate();
                updatedCount_tDBOutput_3 = updatedCount_tDBOutput_3+updateFlag_tDBOutput_3;
                rowsToCommitCount_tDBOutput_3 += updateFlag_tDBOutput_3;

            if(updateFlag_tDBOutput_3 == 0) {

                        if(row8.country_name == null) {
pstmtInsert_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(1, row8.country_name);
}

                        if(row8.country_code == null) {
pstmtInsert_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(2, row8.country_code);
}

                    int processedCount_tDBOutput_3 = pstmtInsert_tDBOutput_3.executeUpdate();
                    insertedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    nb_line_tDBOutput_3++;
                }else{
                    nb_line_tDBOutput_3++;
             }
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_3 = true;
                        nb_line_tDBOutput_3++;
                            System.err.print(e.getMessage());
                }

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "row8"




	
	/**
	 * [tUniqRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_2";

	

 



/**
 * [tUniqRow_2 process_data_end ] stop
 */

} // End of branch "row7"




	
	/**
	 * [tFileInputDelimited_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	


				nb_line_tFileInputDelimited_3++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_3 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_3!=null){
    					csvReadertFileInputDelimited_3.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_3!=null){
    				globalMap.put("tFileInputDelimited_3_NB_LINE",nb_line_tFileInputDelimited_3);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_3", true);
end_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());




/**
 * [tFileInputDelimited_3 end ] stop
 */

	
	/**
	 * [tUniqRow_2 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_2";

	

globalMap.put("tUniqRow_2_NB_UNIQUES",nb_uniques_tUniqRow_2);
globalMap.put("tUniqRow_2_NB_DUPLICATES",nb_duplicates_tUniqRow_2);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tUniqRow_2", true);
end_Hash.put("tUniqRow_2", System.currentTimeMillis());




/**
 * [tUniqRow_2 end ] stop
 */

	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



        if(pstmtUpdate_tDBOutput_3 != null){
            pstmtUpdate_tDBOutput_3.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_3");
        }
        if(pstmtInsert_tDBOutput_3 != null){
            pstmtInsert_tDBOutput_3.close();
            resourceMap.remove("pstmtInsert_tDBOutput_3");
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);

	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
			  	}
			  	
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_3:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk10", 0, "ok");
								} 
							
							tWarn_6Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_3:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk13", 0, "ok");
								} 
							
							tFileInputExcel_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_3 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 finally ] stop
 */

	
	/**
	 * [tUniqRow_2 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_2";

	

 



/**
 * [tUniqRow_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_3 = null;
                if ((pstmtUpdateToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_3")) != null) {
                    pstmtUpdateToClose_tDBOutput_3.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_3 = null;
                if ((pstmtInsertToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_3")) != null) {
                    pstmtInsertToClose_tDBOutput_3.close();
                }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_6_SUBPROCESS_STATE", 0);

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
	 * [tWarn_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_6", false);
		start_Hash.put("tWarn_6", System.currentTimeMillis());
		
	
	currentComponent="tWarn_6";

	
		int tos_count_tWarn_6 = 0;
		

 



/**
 * [tWarn_6 begin ] stop
 */
	
	/**
	 * [tWarn_6 main ] start
	 */

	

	
	
	currentComponent="tWarn_6";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_6", "", Thread.currentThread().getId() + "", "INFO","","Load country data from file to Database - OK","", "");
	tLogCatcher_1.addMessage("tWarn", "tWarn_6", 3, "Load country data from file to Database - OK", 42);
	tLogCatcher_1Process(globalMap);
	globalMap.put("tWarn_6_WARN_MESSAGES", "Load country data from file to Database - OK"); 
	globalMap.put("tWarn_6_WARN_PRIORITY", 3);
	globalMap.put("tWarn_6_WARN_CODE", 42);
	
} catch (Exception e_tWarn_6) {
globalMap.put("tWarn_6_ERROR_MESSAGE",e_tWarn_6.getMessage());
	logIgnoredError(String.format("tWarn_6 - tWarn failed to log message due to internal error: %s", e_tWarn_6), e_tWarn_6);
}


 


	tos_count_tWarn_6++;

/**
 * [tWarn_6 main ] stop
 */
	
	/**
	 * [tWarn_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_6";

	

 



/**
 * [tWarn_6 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_6";

	

 



/**
 * [tWarn_6 process_data_end ] stop
 */
	
	/**
	 * [tWarn_6 end ] start
	 */

	

	
	
	currentComponent="tWarn_6";

	

 

ok_Hash.put("tWarn_6", true);
end_Hash.put("tWarn_6", System.currentTimeMillis());




/**
 * [tWarn_6 end ] stop
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
	 * [tWarn_6 finally ] start
	 */

	

	
	
	currentComponent="tWarn_6";

	

 



/**
 * [tWarn_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_6_SUBPROCESS_STATE", 1);
	}
	

public void tDie_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_4_SUBPROCESS_STATE", 0);

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
	 * [tDie_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_4", false);
		start_Hash.put("tDie_4", System.currentTimeMillis());
		
	
	currentComponent="tDie_4";

	
		int tos_count_tDie_4 = 0;
		

 



/**
 * [tDie_4 begin ] stop
 */
	
	/**
	 * [tDie_4 main ] start
	 */

	

	
	
	currentComponent="tDie_4";

	

	try {
				tLogCatcher_2.addMessage("tDie", "tDie_4", 5, "Load country data from file to Database  - NOK", 4);
				tLogCatcher_2Process(globalMap);
				
	globalMap.put("tDie_4_DIE_PRIORITY", 5);
	System.err.println("Load country data from file to Database  - NOK");
	
	globalMap.put("tDie_4_DIE_MESSAGE", "Load country data from file to Database  - NOK");
	globalMap.put("tDie_4_DIE_MESSAGES", "Load country data from file to Database  - NOK");
	
	} catch (Exception | Error e_tDie_4) {
	    globalMap.put("tDie_4_ERROR_MESSAGE",e_tDie_4.getMessage());
		logIgnoredError(String.format("tDie_4 - tDie failed to log message due to internal error: %s", e_tDie_4), e_tDie_4);
	}
	
	currentComponent = "tDie_4";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_4_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_4++;

/**
 * [tDie_4 main ] stop
 */
	
	/**
	 * [tDie_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_4";

	

 



/**
 * [tDie_4 process_data_begin ] stop
 */
	
	/**
	 * [tDie_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_4";

	

 



/**
 * [tDie_4 process_data_end ] stop
 */
	
	/**
	 * [tDie_4 end ] start
	 */

	

	
	
	currentComponent="tDie_4";

	

 

ok_Hash.put("tDie_4", true);
end_Hash.put("tDie_4", System.currentTimeMillis());




/**
 * [tDie_4 end ] stop
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
	 * [tDie_4 finally ] start
	 */

	

	
	
	currentComponent="tDie_4";

	

 



/**
 * [tDie_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_4_SUBPROCESS_STATE", 1);
	}
	


public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public String region;

				public String getRegion () {
					return this.region;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.region = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.region = readString(dis);
					
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
				
						writeString(this.region,dos);
					
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
				
						writeString(this.region,dos);
					
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
		sb.append(",region="+region);
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

public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
			    public String country_name;

				public String getCountry_name () {
					return this.country_name;
				}
				
			    public String country_code;

				public String getCountry_code () {
					return this.country_code;
				}
				
			    public String region;

				public String getRegion () {
					return this.region;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.region = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

        	try {

        		int length = 0;
		
					this.country_name = readString(dis);
					
					this.country_code = readString(dis);
					
					this.region = readString(dis);
					
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
				
						writeString(this.region,dos);
					
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
				
						writeString(this.region,dos);
					
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
		sb.append(",region="+region);
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
public void tFileInputExcel_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputExcel_2_SUBPROCESS_STATE", 0);

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
row9Struct row9 = new row9Struct();





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row9");
					}
				
		int tos_count_tDBOutput_4 = 0;
		





        int updateKeyCount_tDBOutput_4 = 1;
        if(updateKeyCount_tDBOutput_4 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_4 == 3 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;

String tableName_tDBOutput_4 = "country";
boolean whetherReject_tDBOutput_4 = false;

java.util.Calendar calendar_tDBOutput_4 = java.util.Calendar.getInstance();
calendar_tDBOutput_4.set(1, 0, 1, 0, 0, 0);
long year1_tDBOutput_4 = calendar_tDBOutput_4.getTime().getTime();
calendar_tDBOutput_4.set(10000, 0, 1, 0, 0, 0);
long year10000_tDBOutput_4 = calendar_tDBOutput_4.getTime().getTime();
long date_tDBOutput_4;

java.sql.Connection conn_tDBOutput_4 = null;
	conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	

int count_tDBOutput_4=0;
    	
	    String update_tDBOutput_4 = "UPDATE `" + "country" + "` SET `country` = ?,`region` = ? WHERE `country_code` = ?";
	    
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(update_tDBOutput_4);
	    resourceMap.put("pstmtUpdate_tDBOutput_4", pstmtUpdate_tDBOutput_4);
	    String insert_tDBOutput_4 = "INSERT INTO `" + "country" + "` (`country`,`country_code`,`region`) VALUES (?,?,?)";
	         
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
	    resourceMap.put("pstmtInsert_tDBOutput_4", pstmtInsert_tDBOutput_4);
	    

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tUniqRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_3", false);
		start_Hash.put("tUniqRow_3", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row10");
					}
				
		int tos_count_tUniqRow_3 = 0;
		

	
		class KeyStruct_tUniqRow_3 {
	
			private static final int DEFAULT_HASHCODE = 1;
		    private static final int PRIME = 31;
		    private int hashCode = DEFAULT_HASHCODE;
		    public boolean hashCodeDirty = true;
	
	        
					String country_code;        
	        
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
				final KeyStruct_tUniqRow_3 other = (KeyStruct_tUniqRow_3) obj;
				
									if (this.country_code == null) {
										if (other.country_code != null) 
											return false;
								
									} else if (!this.country_code.equals(other.country_code))
								 
										return false;
								
				
				return true;
			}
	  
	        
		}

	
int nb_uniques_tUniqRow_3 = 0;
int nb_duplicates_tUniqRow_3 = 0;
KeyStruct_tUniqRow_3 finder_tUniqRow_3 = new KeyStruct_tUniqRow_3();
java.util.Set<KeyStruct_tUniqRow_3> keystUniqRow_3 = new java.util.HashSet<KeyStruct_tUniqRow_3>(); 

 



/**
 * [tUniqRow_3 begin ] stop
 */



	
	/**
	 * [tFileInputExcel_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputExcel_2", false);
		start_Hash.put("tFileInputExcel_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputExcel_2";

	
		int tos_count_tFileInputExcel_2 = 0;
		

 
	final String decryptedPassword_tFileInputExcel_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:bpm7WE5eGdHFrVdKoRzNgVTSN5T6GOHqofZOdA==");
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

		Object source_tFileInputExcel_2 = context.input_path+context.country_filename;
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
        sheetList_tFileInputExcel_2.addAll(regexUtil_tFileInputExcel_2.getSheets(workbook_tFileInputExcel_2, 0, false));
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
        int start_column_tFileInputExcel_2 = 1-1;
        int end_column_tFileInputExcel_2 = -1;
        Integer lastColumn_tFileInputExcel_2 = 3;
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
		    row10 = null;
					int tempRowLength_tFileInputExcel_2 = 3;
				
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
			row10 = new row10Struct();
			int curColNum_tFileInputExcel_2 = -1;
			String curColName_tFileInputExcel_2 = "";
			try{
							columnIndex_tFileInputExcel_2 = 0;
						
			if( temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2].length() > 0) {
				curColNum_tFileInputExcel_2=columnIndex_tFileInputExcel_2 + start_column_tFileInputExcel_2 + 1;
				curColName_tFileInputExcel_2 = "country_name";

				row10.country_name = temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2];
			}else{
				row10.country_name = null;
				emptyColumnCount_tFileInputExcel_2++;
			}
							columnIndex_tFileInputExcel_2 = 1;
						
			if( temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2].length() > 0) {
				curColNum_tFileInputExcel_2=columnIndex_tFileInputExcel_2 + start_column_tFileInputExcel_2 + 1;
				curColName_tFileInputExcel_2 = "country_code";

				row10.country_code = temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2];
			}else{
				row10.country_code = null;
				emptyColumnCount_tFileInputExcel_2++;
			}
							columnIndex_tFileInputExcel_2 = 2;
						
			if( temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2].length() > 0) {
				curColNum_tFileInputExcel_2=columnIndex_tFileInputExcel_2 + start_column_tFileInputExcel_2 + 1;
				curColName_tFileInputExcel_2 = "region";

				row10.region = temp_row_tFileInputExcel_2[columnIndex_tFileInputExcel_2];
			}else{
				row10.region = null;
				emptyColumnCount_tFileInputExcel_2++;
			}

				nb_line_tFileInputExcel_2++;
				
			}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_2_ERROR_MESSAGE",e.getMessage());
			whetherReject_tFileInputExcel_2 = true;
					 System.err.println(e.getMessage());
					 row10 = null;
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
// Start of branch "row10"
if(row10 != null) { 



	
	/**
	 * [tUniqRow_3 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row10"
						
						);
					}
					
row9 = null;			
if(row10.country_code == null){
	finder_tUniqRow_3.country_code = null;
}else{
	finder_tUniqRow_3.country_code = row10.country_code.toLowerCase();
}	
finder_tUniqRow_3.hashCodeDirty = true;
if (!keystUniqRow_3.contains(finder_tUniqRow_3)) {
		KeyStruct_tUniqRow_3 new_tUniqRow_3 = new KeyStruct_tUniqRow_3();

		
if(row10.country_code == null){
	new_tUniqRow_3.country_code = null;
}else{
	new_tUniqRow_3.country_code = row10.country_code.toLowerCase();
}
		
		keystUniqRow_3.add(new_tUniqRow_3);if(row9 == null){ 
	
	row9 = new row9Struct();
}row9.country_name = row10.country_name;			row9.country_code = row10.country_code;			row9.region = row10.region;					
		nb_uniques_tUniqRow_3++;
	} else {
	  nb_duplicates_tUniqRow_3++;
	}

 


	tos_count_tUniqRow_3++;

/**
 * [tUniqRow_3 main ] stop
 */
	
	/**
	 * [tUniqRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tUniqRow_3";

	

 



/**
 * [tUniqRow_3 process_data_begin ] stop
 */
// Start of branch "row9"
if(row9 != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row9"
						
						);
					}
					



        whetherReject_tDBOutput_4 = false;
            int updateFlag_tDBOutput_4=0;
                    if(row9.country_name == null) {
pstmtUpdate_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(1, row9.country_name);
}

                    if(row9.region == null) {
pstmtUpdate_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(2, row9.region);
}


                    if(row9.country_code == null) {
pstmtUpdate_tDBOutput_4.setNull(3 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(3 + count_tDBOutput_4, row9.country_code);
}


            try {
                updateFlag_tDBOutput_4=pstmtUpdate_tDBOutput_4.executeUpdate();
                updatedCount_tDBOutput_4 = updatedCount_tDBOutput_4+updateFlag_tDBOutput_4;
                rowsToCommitCount_tDBOutput_4 += updateFlag_tDBOutput_4;

            if(updateFlag_tDBOutput_4 == 0) {

                        if(row9.country_name == null) {
pstmtInsert_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(1, row9.country_name);
}

                        if(row9.country_code == null) {
pstmtInsert_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(2, row9.country_code);
}

                        if(row9.region == null) {
pstmtInsert_tDBOutput_4.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(3, row9.region);
}

                    int processedCount_tDBOutput_4 = pstmtInsert_tDBOutput_4.executeUpdate();
                    insertedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
                }else{
                    nb_line_tDBOutput_4++;
             }
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
                            System.err.print(e.getMessage());
                }

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "row9"




	
	/**
	 * [tUniqRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_3";

	

 



/**
 * [tUniqRow_3 process_data_end ] stop
 */

} // End of branch "row10"




	
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
	 * [tUniqRow_3 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_3";

	

globalMap.put("tUniqRow_3_NB_UNIQUES",nb_uniques_tUniqRow_3);
globalMap.put("tUniqRow_3_NB_DUPLICATES",nb_duplicates_tUniqRow_3);

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row10");
			  	}
			  	
 

ok_Hash.put("tUniqRow_3", true);
end_Hash.put("tUniqRow_3", System.currentTimeMillis());




/**
 * [tUniqRow_3 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



        if(pstmtUpdate_tDBOutput_4 != null){
            pstmtUpdate_tDBOutput_4.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_4");
        }
        if(pstmtInsert_tDBOutput_4 != null){
            pstmtInsert_tDBOutput_4.close();
            resourceMap.remove("pstmtInsert_tDBOutput_4");
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row9");
			  	}
			  	
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
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
	 * [tFileInputExcel_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_2";

	

 



/**
 * [tFileInputExcel_2 finally ] stop
 */

	
	/**
	 * [tUniqRow_3 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_3";

	

 



/**
 * [tUniqRow_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_4 = null;
                if ((pstmtUpdateToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_4")) != null) {
                    pstmtUpdateToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_4 = null;
                if ((pstmtInsertToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_4")) != null) {
                    pstmtInsertToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputExcel_2_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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
	


public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[0];

	
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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
			if(length > commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot.length == 0) {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_s1_LoadData_1Shoot, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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

		synchronized(commonByteArrayLock_LOCAL_PROJECT_s1_LoadData_1Shoot) {

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
        final s1_LoadData_1Shoot s1_LoadData_1ShootClass = new s1_LoadData_1Shoot();

        int exitCode = s1_LoadData_1ShootClass.runJobInTOS(args);

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
            java.io.InputStream inContext = s1_LoadData_1Shoot.class.getClassLoader().getResourceAsStream("local_project/s1_loaddata_1shoot_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = s1_LoadData_1Shoot.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("year_filename", "id_String");
                        if(context.getStringValue("year_filename") == null) {
                            context.year_filename = null;
                        } else {
                            context.year_filename=(String) context.getProperty("year_filename");
                        }
                        context.setContextType("indicator_filename", "id_String");
                        if(context.getStringValue("indicator_filename") == null) {
                            context.indicator_filename = null;
                        } else {
                            context.indicator_filename=(String) context.getProperty("indicator_filename");
                        }
                        context.setContextType("country_filename", "id_String");
                        if(context.getStringValue("country_filename") == null) {
                            context.country_filename = null;
                        } else {
                            context.country_filename=(String) context.getProperty("country_filename");
                        }
                        context.setContextType("country_filename2", "id_String");
                        if(context.getStringValue("country_filename2") == null) {
                            context.country_filename2 = null;
                        } else {
                            context.country_filename2=(String) context.getProperty("country_filename2");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("db_host")) {
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
            }if (parentContextMap.containsKey("year_filename")) {
                context.year_filename = (String) parentContextMap.get("year_filename");
            }if (parentContextMap.containsKey("indicator_filename")) {
                context.indicator_filename = (String) parentContextMap.get("indicator_filename");
            }if (parentContextMap.containsKey("country_filename")) {
                context.country_filename = (String) parentContextMap.get("country_filename");
            }if (parentContextMap.containsKey("country_filename2")) {
                context.country_filename2 = (String) parentContextMap.get("country_filename2");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : s1_LoadData_1Shoot");
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
 *     306943 characters generated by Talend Open Studio for Data Integration 
 *     on the 27 septembre 2023 à 23:29:18 EAT
 ************************************************************************************************/