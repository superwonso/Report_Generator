/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2023-02-09 11:15:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webcontent.birt.pages.dialog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.birt.report.presentation.aggregation.IFragment;
import org.eclipse.birt.report.utility.ParameterAccessor;
import org.eclipse.birt.report.context.BaseAttributeBean;
import org.eclipse.birt.report.engine.api.DataExtractionFormatInfo;
import org.eclipse.birt.report.resource.BirtResources;

public final class SimpleExportDataDialogFragment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.eclipse.birt.report.resource.BirtResources");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.ParameterAccessor");
    _jspx_imports_classes.add("org.eclipse.birt.report.presentation.aggregation.IFragment");
    _jspx_imports_classes.add("org.eclipse.birt.report.engine.api.DataExtractionFormatInfo");
    _jspx_imports_classes.add("org.eclipse.birt.report.context.BaseAttributeBean");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 0, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      org.eclipse.birt.report.presentation.aggregation.IFragment fragment = null;
      fragment = (org.eclipse.birt.report.presentation.aggregation.IFragment) _jspx_page_context.getAttribute("fragment", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (fragment == null){
        throw new java.lang.InstantiationException("bean fragment not found within scope");
      }
      out.write('\n');
      org.eclipse.birt.report.context.BaseAttributeBean attributeBean = null;
      attributeBean = (org.eclipse.birt.report.context.BaseAttributeBean) _jspx_page_context.getAttribute("attributeBean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (attributeBean == null){
        throw new java.lang.InstantiationException("bean attributeBean not found within scope");
      }
      out.write('\n');
      out.write('\n');

	DataExtractionFormatInfo[] dataExtractInfos = ParameterAccessor.supportedDataExtractions;

      out.write('\n');
      out.write("\n");
      out.write("<TABLE ID=\"simpleExportDialogBody\" CELLSPACING=\"2\" CELLPADDING=\"2\" CLASS=\"birtviewer_dialog_body\">\n");
      out.write("\t<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("\t<TR>\n");
      out.write("\t\t<TD>\n");
      out.write("\t\t\t<LABEL FOR=\"resultsets\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.resultsets" ));
      out.write("\n");
      out.write("\t\t\t</LABEL>\n");
      out.write("\t\t</TD>\n");
      out.write("\t</TR>\n");
      out.write("\t<TR>\n");
      out.write("\t\t<TD COLSPAN=\"4\">\n");
      out.write("\t\t\t<SELECT ID=\"resultsets\" CLASS=\"birtviewer_exportdata_dialog_single_select\">\n");
      out.write("\t\t\t</SELECT>\n");
      out.write("\t\t</TD>\n");
      out.write("\t</TR>\n");
      out.write("\t<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("\t<TR>\n");
      out.write("\t\t<TD VALIGN=\"top\">\n");
      out.write("\t\t\t<TABLE STYLE=\"font-size:8pt;\">\n");
      out.write("\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t<LABEL FOR=\"availableColumnSelect\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.availablecolumn" ));
      out.write("</LABEL>\n");
      out.write("\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t<SELECT ID=\"availableColumnSelect\" MULTIPLE=\"true\" SIZE=\"10\" CLASS=\"birtviewer_exportdata_dialog_select\">\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</TD>\n");
      out.write("\t\t<TD VALIGN=\"middle\">\n");
      out.write("\t\t\t<TABLE HEIGHT=\"100%\">\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<TABLE VALIGN=\"middle\">\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Addall\" \n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if( !attributeBean.isRtl())
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/AddAll.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									else
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/AddAll_rtl.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.addall" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.addall" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR height=\"2px\"><TD></TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Add\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if( !attributeBean.isRtl())
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/Add.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									else
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/Add_rtl.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.add" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.add" ));
      out.write("\" \t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR height=\"2px\"><TD></TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Remove\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if( !attributeBean.isRtl())
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/Remove_disabled.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									else
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/Remove_disabled_rtl.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.remove" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.remove" ));
      out.write("\" \t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR height=\"2px\"><TD></TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Removeall\" \n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if( !attributeBean.isRtl())
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/RemoveAll_disabled.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									else
									{
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tSRC=\"birt/images/RemoveAll_disabled_rtl.gif\"\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.removeall" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.removeall" ));
      out.write("\" \t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t\t\t</TABLE>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</TD>\n");
      out.write("\t\t<TD VALIGN=\"middle\">\n");
      out.write("\t\t\t<TABLE HEIGHT=\"100%\">\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<TABLE VALIGN=\"middle\">\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Up\" SRC=\"birt/images/Up_disabled.gif\" \n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.up" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.up" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR height=\"2px\"><TD></TD></TR>\n");
      out.write("\t\t\t\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"image\" NAME=\"Down\" SRC=\"birt/images/Down_disabled.gif\" \n");
      out.write("\t\t\t\t\t\t\t\t\tALT=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.down" ));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\tTITLE=\"");
      out.print( BirtResources.getHtmlMessage( "birt.viewer.dialog.exportdata.down" ));
      out.write("\" \t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tCLASS=\"birtviewer_exportdata_dialog_button\">\n");
      out.write("\t\t\t\t\t\t\t</TD></TR>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</TABLE>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</TD>\n");
      out.write("\t\t<TD >\n");
      out.write("\t\t\t<TABLE STYLE=\"font-size:8pt;\">\n");
      out.write("\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t<LABEL FOR=\"selectedColumnSelect\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.selectedcolumn" ));
      out.write("</LABEL>\n");
      out.write("\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t\t<TR><TD>\n");
      out.write("\t\t\t\t\t<SELECT ID=\"selectedColumnSelect\" MULTIPLE=\"true\" SIZE=\"10\" CLASS=\"birtviewer_exportdata_dialog_select\">\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("\t\t\t\t</TD></TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</TD>\n");
      out.write("\t</TR>\n");
      out.write("\t<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("\t<TR>\n");
      out.write("\t\t<TD COLSPAN=\"4\">\t\t\t\n");
      out.write("\t\t\t<DIV>\n");
      out.write("\t\t\t\t<label for=\"exportDataExtension\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.extension" ));
      out.write("</label>\n");
      out.write("\t\t\t\t<SELECT ID=\"exportDataExtension\" CLASS=\"birtviewer_exportdata_dialog_select\">\n");
      out.write("\t\t\t\t");

					for ( int i = 0; i < dataExtractInfos.length; i++ )
					{
						DataExtractionFormatInfo extensionInfo  = dataExtractInfos[i];
						if( extensionInfo.getId() == null 
							|| extensionInfo.getFormat() == null 
							|| ( extensionInfo.isHidden() != null && extensionInfo.isHidden().booleanValue() ) )
							continue;
						
						String extensionName = extensionInfo.getName( );
						if( extensionName == null )
							extensionName = "";
				
      out.write("\n");
      out.write("\t\t\t\t\t\t<OPTION VALUE=\"");
      out.print( extensionInfo.getId() );
      out.write('"');
      out.write('>');
      out.print( extensionName );
      out.write('(');
      out.write('*');
      out.write('.');
      out.print( extensionInfo.getFormat() );
      out.write(")</OPTION>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t\t</SELECT>\n");
      out.write("\t\t\t</DIV>\n");
      out.write("\t\t\t<BR/>\n");
      out.write("\t\t\t<DIV ID=\"exportDataEncodingSetting\">\n");
      out.write("\t\t\t\t<TABLE>\n");
      out.write("\t\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t\t<TD><label for=\"exportDataEncoding_UTF8\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.encoding" ));
      out.write("</label></TD>\n");
      out.write("\t\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t\t<INPUT TYPE=\"radio\" NAME=\"exportDataEncoding\" ID=\"exportDataEncoding_UTF8\" CHECKED value=\"UTF-8\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exportDataEncoding_UTF8\">UTF-8</label>\n");
      out.write("\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t</TR>\n");
      out.write("\t\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t\t<TD></TD>\n");
      out.write("\t\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\"><TR>\n");
      out.write("\t\t\t\t\t\t\t<TD valign=\"TOP\">\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"radio\" NAME=\"exportDataEncoding\" ID=\"exportDataEncoding_other\">\n");
      out.write("\t\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"exportDataEncoding_other\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.encoding.other" ));
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"text\" NAME=\"exportDataOtherEncoding\" ID=\"exportDataOtherEncoding_input\" CLASS=\"birtviewer_exportdata_dialog_input\" DISABLED=\"true\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.encoding.comment" ));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t\t\t</TR></TABLE>\n");
      out.write("\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t</TR>\n");
      out.write("\t\t\t\t</TABLE>\t\t\t\t\n");
      out.write("\t\t\t</DIV>\n");
      out.write("\t\t\t<BR/>\n");
      out.write("\t\t\t<DIV>\n");
      out.write("\t\t\t\t<label for=\"exportDataCSVSeparator\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.separator" ));
      out.write("</label>\n");
      out.write("\t\t\t\t<SELECT ID=\"exportDataCSVSeparator\" CLASS=\"birtviewer_exportdata_dialog_select\">\n");
      out.write("\t\t\t\t\t<OPTION VALUE=\"0\" SELECTED>");
      out.print( BirtResources.getMessage( "birt.viewer.sep.0" ));
      out.write("</OPTION>\n");
      out.write("\t\t\t\t\t<OPTION VALUE=\"1\">");
      out.print( BirtResources.getMessage( "birt.viewer.sep.1" ));
      out.write("</OPTION>\n");
      out.write("\t\t\t\t\t<OPTION VALUE=\"2\">");
      out.print( BirtResources.getMessage( "birt.viewer.sep.2" ));
      out.write("</OPTION>\n");
      out.write("\t\t\t\t\t<OPTION VALUE=\"3\">");
      out.print( BirtResources.getMessage( "birt.viewer.sep.3" ));
      out.write("</OPTION>\n");
      out.write("\t\t\t\t\t<OPTION VALUE=\"4\">");
      out.print( BirtResources.getMessage( "birt.viewer.sep.4" ));
      out.write("</OPTION>\n");
      out.write("\t\t\t\t</SELECT>\n");
      out.write("\t\t\t</DIV>\n");
      out.write("\t\t\t<BR/>\n");
      out.write("\t\t\t<DIV>\n");
      out.write("\t\t\t\t<TABLE cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t<TR >\n");
      out.write("\t\t\t\t\t\t<TD><INPUT TYPE=\"checkbox\" ID=\"exportColumnDataType\"></TD>\n");
      out.write("\t\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exportColumnDataType\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.datatype" ));
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t\t<TD style=\"padding-left:20px;\" ><INPUT TYPE=\"checkbox\" ID=\"exportColumnLocaleNeutral\"></TD>\n");
      out.write("\t\t\t\t\t\t<TD rowspan=\"2\" valign=\"top\" style=\"padding-top:3px;\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exportColumnLocaleNeutral\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.localeneutral" ));
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t</TR>\n");
      out.write("\t\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t\t<TD><INPUT TYPE=\"checkbox\" ID=\"exportDataWithCR\"></TD>\n");
      out.write("\t\t\t\t\t\t<TD nowrap=\"nowrap\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exportDataWithCR\">");
      out.print( BirtResources.getMessage( "birt.viewer.dialog.exportdata.carriage_return" ));
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t\t</TR>\n");
      out.write("\t\t\t\t</TABLE>\n");
      out.write("\t\t\t</DIV>\n");
      out.write("\t\t</TD>\n");
      out.write("\t</TR>\n");
      out.write("\t<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("</TABLE>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
