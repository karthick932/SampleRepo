/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class UITestScript_Test_A1EFBD0AA93748F0FCD7E56630643330 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public UITestScript_Test_A1EFBD0AA93748F0FCD7E56630643330(IContainer container, String invocationId) {
		super(container, "UITestScript", invocationId, "A1EFBD0AA93748F0FCD7E56630643330", "/WebUITestProject/Tests/UITestScript.testsuite", "C:/Users/karthick_ba/HCL/devopstest/UITest2/WebUITestProject/Tests/UITestScript.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
	this.add(applicationContext_13(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: UITestScript_Test_A1EFBD0AA93748F0FCD7E56630643330 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EFBD0AA937490EFCD7E56630643330");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jpetstore.aspectran.com",
												  "A1EFBD0AA93DD8A0FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>jpetstore.aspectran.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1EFBD0AA93DD8A0FCD7E56630643330\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"jpetstore.aspectran.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/jpetstore.aspectran.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1EFBD0AA9418224FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9418224FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:97;left:852;bottom:124;right:927\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 74, \\\"x\\\": 852, \\\"y\\\": 97 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 124, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signonForm\\\", \\\"left\\\": 852, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 927, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 97, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"335\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'j2ee@test.com' in Edit text whose Label is Username: - jpetstore.aspectran.com",
												  "A1EFBD0AA9527222FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9527222FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":3945,\"isWeb\":false,\"description\":\"Think <i>3,945<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>j2ee@test.com<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Username:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9527222FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"j2ee@test.com\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:204;left:631;bottom:263;right:1256\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 625, \\\"x\\\": 631, \\\"y\\\": 204 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 263, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"j2ee\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"Username:\\\", \\\"left\\\": 631, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1256, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 204, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"j2ee\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"335\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/label\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'test' in Password field whose Label is Password: - jpetstore.aspectran.com",
												  "A1EFBD0AA9611814FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9611814FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":4646,\"isWeb\":false,\"description\":\"Think <i>4,646<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>test<\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password:<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9611814FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"test\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password:\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:327;left:631;bottom:386;right:1256\\\", \\\"Geometry\\\": { \\\"height\\\": 58, \\\"width\\\": 625, \\\"x\\\": 631, \\\"y\\\": 327 }, \\\"Style$array$\\\": \\\"background-color:rgb(254, 254, 254);background-repeat:repeat;color:rgb(10, 10, 10);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none solid rgb(10, 10, 10);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FEFEFEFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 386, \\\"color\\\": \\\"0A0A0AFF\\\", \\\"content\\\": \\\"j2ee\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"Password:\\\", \\\"left\\\": 631, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"password\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 1256, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(10, 10, 10)\\\", \\\"top\\\": 327, \\\"type\\\": \\\"password\\\", \\\"value\\\": \\\"j2ee\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"467\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/label[2]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Login - jpetstore.aspectran.com",
												  "A1EFBD0AA96D2604FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA96D2604FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":2444,\"isWeb\":false,\"description\":\"Think <i>2,444<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA96D2604FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:410;left:894;bottom:470;right:993\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 99, \\\"x\\\": 894, \\\"y\\\": 410 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 470, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 894, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 993, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 410, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"729\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Signon']\\\\\\/form\\\\\\/div\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish located at position 1 - jpetstore.aspectran.com",
												  "A1EFBD0AA976EA12FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA976EA12FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":1611,\"isWeb\":false,\"description\":\"Think <i>1,611<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA976EA12FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:177;left:708;bottom:210;right:783\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 74, \\\"x\\\": 708, \\\"y\\\": 177 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(67, 146, 26);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:10px;padding-right:10px;padding-top:0px;text-align:center;text-decoration:none solid rgb(67, 146, 26);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 210, \\\"color\\\": \\\"43921AFF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 708, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 10, \\\"padding-right\\\": 10, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 783, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(67, 146, 26)\\\", \\\"top\\\": 177, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"379\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='QuickLinks']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is FI-SW-01 - jpetstore.aspectran.com",
												  "A1EFBD0AA9880104FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9880104FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":1666,\"isWeb\":false,\"description\":\"Think <i>1,666<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>FI-SW-01<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9880104FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"FI-SW-01\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:242;left:436;bottom:275;right:533\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 97, \\\"x\\\": 436, \\\"y\\\": 242 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 187, 255);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(51, 187, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 275, \\\"color\\\": \\\"33BBFFFF\\\", \\\"content\\\": \\\"FI-SW-01\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/products\\\\\\/FI-SW-01\\\", \\\"left\\\": 436, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 533, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(51, 187, 255)\\\", \\\"top\\\": 242, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"372\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Url is /cart/addItemToCart?itemId=EST-1 - jpetstore.aspectran.com",
												  "A1EFBD0AA9945D22FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9945D22FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":1584,\"isWeb\":false,\"description\":\"Think <i>1,584<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Url<\\/b> is <b>\\/cart\\/addItemToCart?itemId=EST-1<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9945D22FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"href\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/cart\\/addItemToCart?itemId=EST-1\"},\"name\":\"href\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:391;left:1568;bottom:452;right:1727\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 159, \\\"x\\\": 1568, \\\"y\\\": 391 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 452, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Add to Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/cart\\\\\\/addItemToCart?itemId=EST-1\\\", \\\"left\\\": 1568, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1727, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 391, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"386\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Catalog']\\\\\\/table\\\\\\/tbody\\\\\\/tr[2]\\\\\\/td[5]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Proceed to Checkout - jpetstore.aspectran.com",
												  "A1EFBD0AA9A32A32FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9A32A32FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":2649,\"isWeb\":false,\"description\":\"Think <i>2,649<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Proceed to Checkout<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9A32A32FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Proceed to Checkout\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:429;left:816;bottom:489;right:1071\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 254, \\\"x\\\": 816, \\\"y\\\": 429 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 489, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Proceed to Checkout\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/order\\\\\\/newOrderForm\\\", \\\"left\\\": 816, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1071, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 429, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"482\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='Cart']\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Continue - jpetstore.aspectran.com",
												  "A1EFBD0AA9B3F30BFCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9B3F30BFCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":3984,\"isWeb\":false,\"description\":\"Think <i>3,984<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Continue<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9B3F30BFCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:145;left:816;bottom:205;right:953\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 136, \\\"x\\\": 816, \\\"y\\\": 145 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 205, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Continue\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 816, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 953, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 145, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"536\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Confirm - jpetstore.aspectran.com",
												  "A1EFBD0AA9C27202FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9C27202FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":2464,\"isWeb\":false,\"description\":\"Think <i>2,464<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Confirm<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9C27202FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Confirm\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:196;left:831;bottom:257;right:957\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 126, \\\"x\\\": 831, \\\"y\\\": 196 }, \\\"Style$array$\\\": \\\"background-color:rgb(69, 82, 89);background-repeat:repeat;color:rgb(254, 254, 254);font-family:\\\\\\\"Open Sans\\\\\\\", sans-serif;font-size:14.4px;font-style:normal;font-weight:400;line-height:14.4px;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12.24px;padding-left:14.4px;padding-right:14.4px;padding-top:12.24px;text-align:center;text-decoration:none solid rgb(254, 254, 254);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"455259FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 257, \\\"class\\\": \\\"button\\\", \\\"color\\\": \\\"FEFEFEFF\\\", \\\"content\\\": \\\"Confirm\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", sans-serif\\\", \\\"font-size\\\": \\\"14.4\\\", \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 831, \\\"line-height\\\": \\\"14.4\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": \\\"12.24\\\", \\\"padding-left\\\": \\\"14.4\\\", \\\"padding-right\\\": \\\"14.4\\\", \\\"padding-top\\\": \\\"12.24\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 957, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(254, 254, 254)\\\", \\\"top\\\": 196, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"545\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='CenterForm']\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign Out - jpetstore.aspectran.com",
												  "A1EFBD0AA9D11802FCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EFBD0AA9D11802FCD7E56630643330\",\"preferredThinktime\":0,\"thinktime\":3999,\"isWeb\":false,\"description\":\"Think <i>3,999<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign Out<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9D11802FCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign Out\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:547;left:1036;bottom:574;right:1129\\\", \\\"Geometry\\\": { \\\"height\\\": 27, \\\"width\\\": 93, \\\"x\\\": 1036, \\\"y\\\": 547 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(234, 172, 0);font-family:helvetica, tahoma, arial, verdana, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:74.6719px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(234, 172, 0);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 574, \\\"color\\\": \\\"EAAC00FF\\\", \\\"content\\\": \\\"Sign Out\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"helvetica, tahoma, arial, verdana, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signoff\\\", \\\"left\\\": 1036, \\\"line-height\\\": \\\"74.6719\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1129, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(234, 172, 0)\\\", \\\"top\\\": 547, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"535\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='MenuContent']\\\\\\/a[4]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - jpetstore.aspectran.com",
												  "A1EFBD0AA9E478EEFCD7E56630643330",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"5e8b0dea-064b-4447-9254-1f4a34efecc5\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EFBD0AA9E478EEFCD7E56630643330\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/WebUITestProject/Tests/UITestScript.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
