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


package local_project.pipeline_report_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
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
 * Job: pipeline_report Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class pipeline_report implements TalendJob {

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
			
			if(country_filename != null){
				
					this.setProperty("country_filename", country_filename.toString());
				
			}
			
			if(country_filename2 != null){
				
					this.setProperty("country_filename2", country_filename2.toString());
				
			}
			
			if(cpi_filename != null){
				
					this.setProperty("cpi_filename", cpi_filename.toString());
				
			}
			
			if(db_host != null){
				
					this.setProperty("db_host", db_host.toString());
				
			}
			
			if(db_name != null){
				
					this.setProperty("db_name", db_name.toString());
				
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
			
			if(indicator_filename != null){
				
					this.setProperty("indicator_filename", indicator_filename.toString());
				
			}
			
			if(input_path != null){
				
					this.setProperty("input_path", input_path.toString());
				
			}
			
			if(log_path != null){
				
					this.setProperty("log_path", log_path.toString());
				
			}
			
			if(other_indc_filename != null){
				
					this.setProperty("other_indc_filename", other_indc_filename.toString());
				
			}
			
			if(output_path != null){
				
					this.setProperty("output_path", output_path.toString());
				
			}
			
			if(report_name != null){
				
					this.setProperty("report_name", report_name.toString());
				
			}
			
			if(template_report_name != null){
				
					this.setProperty("template_report_name", template_report_name.toString());
				
			}
			
			if(year_filename != null){
				
					this.setProperty("year_filename", year_filename.toString());
				
			}
			
			if(year_report != null){
				
					this.setProperty("year_report", year_report.toString());
				
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

public String country_filename;
public String getCountry_filename(){
	return this.country_filename;
}
public String country_filename2;
public String getCountry_filename2(){
	return this.country_filename2;
}
public String cpi_filename;
public String getCpi_filename(){
	return this.cpi_filename;
}
public String db_host;
public String getDb_host(){
	return this.db_host;
}
public String db_name;
public String getDb_name(){
	return this.db_name;
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
public String indicator_filename;
public String getIndicator_filename(){
	return this.indicator_filename;
}
public String input_path;
public String getInput_path(){
	return this.input_path;
}
public String log_path;
public String getLog_path(){
	return this.log_path;
}
public String other_indc_filename;
public String getOther_indc_filename(){
	return this.other_indc_filename;
}
public String output_path;
public String getOutput_path(){
	return this.output_path;
}
public String report_name;
public String getReport_name(){
	return this.report_name;
}
public String template_report_name;
public String getTemplate_report_name(){
	return this.template_report_name;
}
public String year_filename;
public String getYear_filename(){
	return this.year_filename;
}
public Integer year_report;
public Integer getYear_report(){
	return this.year_report;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "pipeline_report";
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
				pipeline_report.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(pipeline_report.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tRunJob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRunJob_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRunJob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRunJob_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	





public void tRunJob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_1_SUBPROCESS_STATE", 0);

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
	 * [tRunJob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_1", false);
		start_Hash.put("tRunJob_1", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_1";

	
		int tos_count_tRunJob_1 = 0;
		


 



/**
 * [tRunJob_1 begin ] stop
 */
	
	/**
	 * [tRunJob_1 main ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	
	java.util.List<String> paraList_tRunJob_1 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_1.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_1.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_1.add("--father_node=tRunJob_1");
	      			
	        				paraList_tRunJob_1.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_1.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_1.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_1.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_1 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_1 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_1".equals(tRunJobName_tRunJob_1) && childResumePath_tRunJob_1 != null){
		paraList_tRunJob_1.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_1.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_1");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_1 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_1 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_1.put("country_filename", context.country_filename);
                    paraList_tRunJob_1.add("--context_type " + "country_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("country_filename2", context.country_filename2);
                    paraList_tRunJob_1.add("--context_type " + "country_filename2" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("cpi_filename", context.cpi_filename);
                    paraList_tRunJob_1.add("--context_type " + "cpi_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("db_host", context.db_host);
                    paraList_tRunJob_1.add("--context_type " + "db_host" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("db_name", context.db_name);
                    paraList_tRunJob_1.add("--context_type " + "db_name" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("db_port", context.db_port);
                    paraList_tRunJob_1.add("--context_type " + "db_port" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("db_pwd", context.db_pwd);
                    paraList_tRunJob_1.add("--context_type " + "db_pwd" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("db_user", context.db_user);
                    paraList_tRunJob_1.add("--context_type " + "db_user" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("indicator_filename", context.indicator_filename);
                    paraList_tRunJob_1.add("--context_type " + "indicator_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("input_path", context.input_path);
                    paraList_tRunJob_1.add("--context_type " + "input_path" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("log_path", context.log_path);
                    paraList_tRunJob_1.add("--context_type " + "log_path" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("other_indc_filename", context.other_indc_filename);
                    paraList_tRunJob_1.add("--context_type " + "other_indc_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("output_path", context.output_path);
                    paraList_tRunJob_1.add("--context_type " + "output_path" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("report_name", context.report_name);
                    paraList_tRunJob_1.add("--context_type " + "report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("template_report_name", context.template_report_name);
                    paraList_tRunJob_1.add("--context_type " + "template_report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("year_filename", context.year_filename);
                    paraList_tRunJob_1.add("--context_type " + "year_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_1.put("year_report", context.year_report);
                    paraList_tRunJob_1.add("--context_type " + "year_report" + "=" + "id_Integer");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_1().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_1 = context.propertyNames();
		while (propertyNames_tRunJob_1.hasMoreElements()) {
			String key_tRunJob_1 = (String) propertyNames_tRunJob_1.nextElement();
			Object value_tRunJob_1 = (Object) context.get(key_tRunJob_1);
			if(value_tRunJob_1!=null) {  
				paraList_tRunJob_1.add("--context_param " + key_tRunJob_1 + "=" + value_tRunJob_1);
			} else {
				paraList_tRunJob_1.add("--context_param " + key_tRunJob_1 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_1 = null;

	
	
		local_project.s1_loaddata_1shoot_0_1.s1_LoadData_1Shoot childJob_tRunJob_1 = new local_project.s1_loaddata_1shoot_0_1.s1_LoadData_1Shoot();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_1 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_1) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_1 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_1 : talendDataSources_tRunJob_1
			        .entrySet()) {
	            dataSources_tRunJob_1.put(talendDataSourceEntry_tRunJob_1.getKey(),
	                    talendDataSourceEntry_tRunJob_1.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_1.setDataSources(dataSources_tRunJob_1);
	    }
		  
			childJob_tRunJob_1.parentContextMap = parentContextMap_tRunJob_1;
		  
		
		String[][] childReturn_tRunJob_1 = childJob_tRunJob_1.runJob((String[]) paraList_tRunJob_1.toArray(new String[paraList_tRunJob_1.size()]));
		
            if(childJob_tRunJob_1.getErrorCode() == null){
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getStatus() != null && ("failure").equals(childJob_tRunJob_1.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_1_CHILD_RETURN_CODE", childJob_tRunJob_1.getErrorCode());
            }
            if (childJob_tRunJob_1.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_1_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_1.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_1.getErrorCode();
                if (childJob_tRunJob_1.getErrorCode() != null || ("failure").equals(childJob_tRunJob_1.getStatus())) {
                    java.lang.Exception ce_tRunJob_1 = childJob_tRunJob_1.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_1!=null) ? (ce_tRunJob_1.getClass().getName() + ": " + ce_tRunJob_1.getMessage()) : ""));
                }

 


	tos_count_tRunJob_1++;

/**
 * [tRunJob_1 main ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_1 end ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 

ok_Hash.put("tRunJob_1", true);
end_Hash.put("tRunJob_1", System.currentTimeMillis());




/**
 * [tRunJob_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tRunJob_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_1 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_1";

	

 



/**
 * [tRunJob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_1_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_2_SUBPROCESS_STATE", 0);

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
	 * [tRunJob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_2", false);
		start_Hash.put("tRunJob_2", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_2";

	
		int tos_count_tRunJob_2 = 0;
		


 



/**
 * [tRunJob_2 begin ] stop
 */
	
	/**
	 * [tRunJob_2 main ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	
	java.util.List<String> paraList_tRunJob_2 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_2.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_2.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_2.add("--father_node=tRunJob_2");
	      			
	        				paraList_tRunJob_2.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_2.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_2.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_2.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_2 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_2 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_2".equals(tRunJobName_tRunJob_2) && childResumePath_tRunJob_2 != null){
		paraList_tRunJob_2.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_2.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_2");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_2 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_2 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_2.put("country_filename", context.country_filename);
                    paraList_tRunJob_2.add("--context_type " + "country_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("country_filename2", context.country_filename2);
                    paraList_tRunJob_2.add("--context_type " + "country_filename2" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("cpi_filename", context.cpi_filename);
                    paraList_tRunJob_2.add("--context_type " + "cpi_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("db_host", context.db_host);
                    paraList_tRunJob_2.add("--context_type " + "db_host" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("db_name", context.db_name);
                    paraList_tRunJob_2.add("--context_type " + "db_name" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("db_port", context.db_port);
                    paraList_tRunJob_2.add("--context_type " + "db_port" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("db_pwd", context.db_pwd);
                    paraList_tRunJob_2.add("--context_type " + "db_pwd" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("db_user", context.db_user);
                    paraList_tRunJob_2.add("--context_type " + "db_user" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("indicator_filename", context.indicator_filename);
                    paraList_tRunJob_2.add("--context_type " + "indicator_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("input_path", context.input_path);
                    paraList_tRunJob_2.add("--context_type " + "input_path" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("log_path", context.log_path);
                    paraList_tRunJob_2.add("--context_type " + "log_path" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("other_indc_filename", context.other_indc_filename);
                    paraList_tRunJob_2.add("--context_type " + "other_indc_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("output_path", context.output_path);
                    paraList_tRunJob_2.add("--context_type " + "output_path" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("report_name", context.report_name);
                    paraList_tRunJob_2.add("--context_type " + "report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("template_report_name", context.template_report_name);
                    paraList_tRunJob_2.add("--context_type " + "template_report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("year_filename", context.year_filename);
                    paraList_tRunJob_2.add("--context_type " + "year_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_2.put("year_report", context.year_report);
                    paraList_tRunJob_2.add("--context_type " + "year_report" + "=" + "id_Integer");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_2().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_2 = context.propertyNames();
		while (propertyNames_tRunJob_2.hasMoreElements()) {
			String key_tRunJob_2 = (String) propertyNames_tRunJob_2.nextElement();
			Object value_tRunJob_2 = (Object) context.get(key_tRunJob_2);
			if(value_tRunJob_2!=null) {  
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + value_tRunJob_2);
			} else {
				paraList_tRunJob_2.add("--context_param " + key_tRunJob_2 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_2 = null;

	
	
		local_project.s2_loaddata_4report_0_1.s2_LoadData_4Report childJob_tRunJob_2 = new local_project.s2_loaddata_4report_0_1.s2_LoadData_4Report();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_2 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_2) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_2 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_2 : talendDataSources_tRunJob_2
			        .entrySet()) {
	            dataSources_tRunJob_2.put(talendDataSourceEntry_tRunJob_2.getKey(),
	                    talendDataSourceEntry_tRunJob_2.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_2.setDataSources(dataSources_tRunJob_2);
	    }
		  
			childJob_tRunJob_2.parentContextMap = parentContextMap_tRunJob_2;
		  
		
		String[][] childReturn_tRunJob_2 = childJob_tRunJob_2.runJob((String[]) paraList_tRunJob_2.toArray(new String[paraList_tRunJob_2.size()]));
		
            if(childJob_tRunJob_2.getErrorCode() == null){
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getStatus() != null && ("failure").equals(childJob_tRunJob_2.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_2_CHILD_RETURN_CODE", childJob_tRunJob_2.getErrorCode());
            }
            if (childJob_tRunJob_2.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_2_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_2.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_2.getErrorCode();
                if (childJob_tRunJob_2.getErrorCode() != null || ("failure").equals(childJob_tRunJob_2.getStatus())) {
                    java.lang.Exception ce_tRunJob_2 = childJob_tRunJob_2.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_2!=null) ? (ce_tRunJob_2.getClass().getName() + ": " + ce_tRunJob_2.getMessage()) : ""));
                }

 


	tos_count_tRunJob_2++;

/**
 * [tRunJob_2 main ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_2 end ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 

ok_Hash.put("tRunJob_2", true);
end_Hash.put("tRunJob_2", System.currentTimeMillis());




/**
 * [tRunJob_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tRunJob_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tRunJob_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tRunJob_2 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_2";

	

 



/**
 * [tRunJob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_2_SUBPROCESS_STATE", 1);
	}
	

public void tRunJob_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRunJob_3_SUBPROCESS_STATE", 0);

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
	 * [tRunJob_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tRunJob_3", false);
		start_Hash.put("tRunJob_3", System.currentTimeMillis());
		
	
	currentComponent="tRunJob_3";

	
		int tos_count_tRunJob_3 = 0;
		


 



/**
 * [tRunJob_3 begin ] stop
 */
	
	/**
	 * [tRunJob_3 main ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	
	java.util.List<String> paraList_tRunJob_3 = new java.util.ArrayList<String>();
	
	        				paraList_tRunJob_3.add("--father_pid="+pid);
	      			
	        				paraList_tRunJob_3.add("--root_pid="+rootPid);
	      			
	        				paraList_tRunJob_3.add("--father_node=tRunJob_3");
	      			
	        				paraList_tRunJob_3.add("--context=Default");
	      			
		if(enableLogStash){
			paraList_tRunJob_3.add("--audit.enabled="+enableLogStash);
		}
		
	//for feature:10589
	
		paraList_tRunJob_3.add("--stat_port=" + portStats);
	

	if(resuming_logs_dir_path != null){
		paraList_tRunJob_3.add("--resuming_logs_dir_path=" + resuming_logs_dir_path);
	}
	String childResumePath_tRunJob_3 = ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path);
	String tRunJobName_tRunJob_3 = ResumeUtil.getRighttRunJob(resuming_checkpoint_path);
	if("tRunJob_3".equals(tRunJobName_tRunJob_3) && childResumePath_tRunJob_3 != null){
		paraList_tRunJob_3.add("--resuming_checkpoint_path=" + ResumeUtil.getChildJobCheckPointPath(resuming_checkpoint_path));
	}
	paraList_tRunJob_3.add("--parent_part_launcher=JOB:" + jobName + "/NODE:tRunJob_3");
	
	java.util.Map<String, Object> parentContextMap_tRunJob_3 = new java.util.HashMap<String, Object>();

	
		
		context.synchronizeContext();
            class ContextProcessor_tRunJob_3 {
                    private void transmitContext_0() {
                    parentContextMap_tRunJob_3.put("country_filename", context.country_filename);
                    paraList_tRunJob_3.add("--context_type " + "country_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("country_filename2", context.country_filename2);
                    paraList_tRunJob_3.add("--context_type " + "country_filename2" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("cpi_filename", context.cpi_filename);
                    paraList_tRunJob_3.add("--context_type " + "cpi_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("db_host", context.db_host);
                    paraList_tRunJob_3.add("--context_type " + "db_host" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("db_name", context.db_name);
                    paraList_tRunJob_3.add("--context_type " + "db_name" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("db_port", context.db_port);
                    paraList_tRunJob_3.add("--context_type " + "db_port" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("db_pwd", context.db_pwd);
                    paraList_tRunJob_3.add("--context_type " + "db_pwd" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("db_user", context.db_user);
                    paraList_tRunJob_3.add("--context_type " + "db_user" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("indicator_filename", context.indicator_filename);
                    paraList_tRunJob_3.add("--context_type " + "indicator_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("input_path", context.input_path);
                    paraList_tRunJob_3.add("--context_type " + "input_path" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("log_path", context.log_path);
                    paraList_tRunJob_3.add("--context_type " + "log_path" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("other_indc_filename", context.other_indc_filename);
                    paraList_tRunJob_3.add("--context_type " + "other_indc_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("output_path", context.output_path);
                    paraList_tRunJob_3.add("--context_type " + "output_path" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("report_name", context.report_name);
                    paraList_tRunJob_3.add("--context_type " + "report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("template_report_name", context.template_report_name);
                    paraList_tRunJob_3.add("--context_type " + "template_report_name" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("year_filename", context.year_filename);
                    paraList_tRunJob_3.add("--context_type " + "year_filename" + "=" + "id_String");
                    parentContextMap_tRunJob_3.put("year_report", context.year_report);
                    paraList_tRunJob_3.add("--context_type " + "year_report" + "=" + "id_Integer");
                        }
                    public void transmitAllContext() {
                        transmitContext_0();
                    }
            }
            new ContextProcessor_tRunJob_3().transmitAllContext();
		java.util.Enumeration<?> propertyNames_tRunJob_3 = context.propertyNames();
		while (propertyNames_tRunJob_3.hasMoreElements()) {
			String key_tRunJob_3 = (String) propertyNames_tRunJob_3.nextElement();
			Object value_tRunJob_3 = (Object) context.get(key_tRunJob_3);
			if(value_tRunJob_3!=null) {  
				paraList_tRunJob_3.add("--context_param " + key_tRunJob_3 + "=" + value_tRunJob_3);
			} else {
				paraList_tRunJob_3.add("--context_param " + key_tRunJob_3 + "=" + NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY);
			}
			
		}
		

	Object obj_tRunJob_3 = null;

	
	
		local_project.s3_generatereport_0_1.s3_GenerateReport childJob_tRunJob_3 = new local_project.s3_generatereport_0_1.s3_GenerateReport();
	    // pass DataSources
	    java.util.Map<String, routines.system.TalendDataSource> talendDataSources_tRunJob_3 = (java.util.Map<String, routines.system.TalendDataSource>) globalMap
	            .get(KEY_DB_DATASOURCES);
	    if (null != talendDataSources_tRunJob_3) {
	        java.util.Map<String, javax.sql.DataSource> dataSources_tRunJob_3 = new java.util.HashMap<String, javax.sql.DataSource>();
	        for (java.util.Map.Entry<String, routines.system.TalendDataSource> talendDataSourceEntry_tRunJob_3 : talendDataSources_tRunJob_3
			        .entrySet()) {
	            dataSources_tRunJob_3.put(talendDataSourceEntry_tRunJob_3.getKey(),
	                    talendDataSourceEntry_tRunJob_3.getValue().getRawDataSource());
	        }
	        childJob_tRunJob_3.setDataSources(dataSources_tRunJob_3);
	    }
		  
			childJob_tRunJob_3.parentContextMap = parentContextMap_tRunJob_3;
		  
		
		String[][] childReturn_tRunJob_3 = childJob_tRunJob_3.runJob((String[]) paraList_tRunJob_3.toArray(new String[paraList_tRunJob_3.size()]));
		
            if(childJob_tRunJob_3.getErrorCode() == null){
                globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getStatus() != null && ("failure").equals(childJob_tRunJob_3.getStatus()) ? 1 : 0);
            }else{
                globalMap.put("tRunJob_3_CHILD_RETURN_CODE", childJob_tRunJob_3.getErrorCode());
            }
            if (childJob_tRunJob_3.getExceptionStackTrace() != null) {
                globalMap.put("tRunJob_3_CHILD_EXCEPTION_STACKTRACE", childJob_tRunJob_3.getExceptionStackTrace());
            }
                    errorCode = childJob_tRunJob_3.getErrorCode();
                if (childJob_tRunJob_3.getErrorCode() != null || ("failure").equals(childJob_tRunJob_3.getStatus())) {
                    java.lang.Exception ce_tRunJob_3 = childJob_tRunJob_3.getException();
                    throw new RuntimeException("Child job running failed.\n" + ((ce_tRunJob_3!=null) ? (ce_tRunJob_3.getClass().getName() + ": " + ce_tRunJob_3.getMessage()) : ""));
                }

 


	tos_count_tRunJob_3++;

/**
 * [tRunJob_3 main ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_begin ] stop
 */
	
	/**
	 * [tRunJob_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 process_data_end ] stop
 */
	
	/**
	 * [tRunJob_3 end ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 

ok_Hash.put("tRunJob_3", true);
end_Hash.put("tRunJob_3", System.currentTimeMillis());




/**
 * [tRunJob_3 end ] stop
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
	 * [tRunJob_3 finally ] start
	 */

	

	
	
	currentComponent="tRunJob_3";

	

 



/**
 * [tRunJob_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRunJob_3_SUBPROCESS_STATE", 1);
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
        final pipeline_report pipeline_reportClass = new pipeline_report();

        int exitCode = pipeline_reportClass.runJobInTOS(args);

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
            java.io.InputStream inContext = pipeline_report.class.getClassLoader().getResourceAsStream("local_project/pipeline_report_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = pipeline_report.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("cpi_filename", "id_String");
                        if(context.getStringValue("cpi_filename") == null) {
                            context.cpi_filename = null;
                        } else {
                            context.cpi_filename=(String) context.getProperty("cpi_filename");
                        }
                        context.setContextType("db_host", "id_String");
                        if(context.getStringValue("db_host") == null) {
                            context.db_host = null;
                        } else {
                            context.db_host=(String) context.getProperty("db_host");
                        }
                        context.setContextType("db_name", "id_String");
                        if(context.getStringValue("db_name") == null) {
                            context.db_name = null;
                        } else {
                            context.db_name=(String) context.getProperty("db_name");
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
                        context.setContextType("indicator_filename", "id_String");
                        if(context.getStringValue("indicator_filename") == null) {
                            context.indicator_filename = null;
                        } else {
                            context.indicator_filename=(String) context.getProperty("indicator_filename");
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
                        context.setContextType("other_indc_filename", "id_String");
                        if(context.getStringValue("other_indc_filename") == null) {
                            context.other_indc_filename = null;
                        } else {
                            context.other_indc_filename=(String) context.getProperty("other_indc_filename");
                        }
                        context.setContextType("output_path", "id_String");
                        if(context.getStringValue("output_path") == null) {
                            context.output_path = null;
                        } else {
                            context.output_path=(String) context.getProperty("output_path");
                        }
                        context.setContextType("report_name", "id_String");
                        if(context.getStringValue("report_name") == null) {
                            context.report_name = null;
                        } else {
                            context.report_name=(String) context.getProperty("report_name");
                        }
                        context.setContextType("template_report_name", "id_String");
                        if(context.getStringValue("template_report_name") == null) {
                            context.template_report_name = null;
                        } else {
                            context.template_report_name=(String) context.getProperty("template_report_name");
                        }
                        context.setContextType("year_filename", "id_String");
                        if(context.getStringValue("year_filename") == null) {
                            context.year_filename = null;
                        } else {
                            context.year_filename=(String) context.getProperty("year_filename");
                        }
                        context.setContextType("year_report", "id_Integer");
                        if(context.getStringValue("year_report") == null) {
                            context.year_report = null;
                        } else {
                            try{
                                context.year_report=routines.system.ParserUtils.parseTo_Integer (context.getProperty("year_report"));
                            } catch(NumberFormatException e){
                                System.err.println(String.format("Null value will be used for context parameter %s: %s", "year_report", e.getMessage()));
                                context.year_report=null;
                            }
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("country_filename")) {
                context.country_filename = (String) parentContextMap.get("country_filename");
            }if (parentContextMap.containsKey("country_filename2")) {
                context.country_filename2 = (String) parentContextMap.get("country_filename2");
            }if (parentContextMap.containsKey("cpi_filename")) {
                context.cpi_filename = (String) parentContextMap.get("cpi_filename");
            }if (parentContextMap.containsKey("db_host")) {
                context.db_host = (String) parentContextMap.get("db_host");
            }if (parentContextMap.containsKey("db_name")) {
                context.db_name = (String) parentContextMap.get("db_name");
            }if (parentContextMap.containsKey("db_port")) {
                context.db_port = (String) parentContextMap.get("db_port");
            }if (parentContextMap.containsKey("db_pwd")) {
                context.db_pwd = (String) parentContextMap.get("db_pwd");
            }if (parentContextMap.containsKey("db_user")) {
                context.db_user = (String) parentContextMap.get("db_user");
            }if (parentContextMap.containsKey("indicator_filename")) {
                context.indicator_filename = (String) parentContextMap.get("indicator_filename");
            }if (parentContextMap.containsKey("input_path")) {
                context.input_path = (String) parentContextMap.get("input_path");
            }if (parentContextMap.containsKey("log_path")) {
                context.log_path = (String) parentContextMap.get("log_path");
            }if (parentContextMap.containsKey("other_indc_filename")) {
                context.other_indc_filename = (String) parentContextMap.get("other_indc_filename");
            }if (parentContextMap.containsKey("output_path")) {
                context.output_path = (String) parentContextMap.get("output_path");
            }if (parentContextMap.containsKey("report_name")) {
                context.report_name = (String) parentContextMap.get("report_name");
            }if (parentContextMap.containsKey("template_report_name")) {
                context.template_report_name = (String) parentContextMap.get("template_report_name");
            }if (parentContextMap.containsKey("year_filename")) {
                context.year_filename = (String) parentContextMap.get("year_filename");
            }if (parentContextMap.containsKey("year_report")) {
                context.year_report = (Integer) parentContextMap.get("year_report");
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
errorCode = null;tRunJob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tRunJob_1) {
globalMap.put("tRunJob_1_SUBPROCESS_STATE", -1);

e_tRunJob_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : pipeline_report");
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


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();






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
 *     69592 characters generated by Talend Open Studio for Data Integration 
 *     on the 27 septembre 2023 à 23:29:20 EAT
 ************************************************************************************************/