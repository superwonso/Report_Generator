/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2023-02-09 11:39:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webcontent.birt.pages.parameter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.birt.report.context.ScalarParameterBean;
import org.eclipse.birt.report.context.BaseAttributeBean;
import org.eclipse.birt.report.IBirtConstants;
import org.eclipse.birt.report.service.api.ParameterSelectionChoice;
import org.eclipse.birt.report.utility.ParameterAccessor;
import org.eclipse.birt.report.utility.DataUtil;
import java.util.List;

public final class ComboBoxParameterFragment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("org.eclipse.birt.report.context.ScalarParameterBean");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.DataUtil");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.ParameterAccessor");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.eclipse.birt.report.service.api.ParameterSelectionChoice");
    _jspx_imports_classes.add("org.eclipse.birt.report.IBirtConstants");
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
      org.eclipse.birt.report.context.BaseAttributeBean attributeBean = null;
      attributeBean = (org.eclipse.birt.report.context.BaseAttributeBean) _jspx_page_context.getAttribute("attributeBean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (attributeBean == null){
        throw new java.lang.InstantiationException("bean attributeBean not found within scope");
      }
      out.write('\n');
      out.write('\n');
      out.write('\n');

	ScalarParameterBean parameterBean = ( ScalarParameterBean ) attributeBean.getParameterBean( );
	String encodedParameterName = ParameterAccessor.htmlEncode( parameterBean.getName( ) );
	String paramValue = parameterBean.getValue( );
	String displayText = parameterBean.getDisplayText( );
	String defaultValue = parameterBean.getDefaultValue( );
	String defaultDisplayText = parameterBean.getDefaultDisplayText( );
	boolean isDisplayTextInList = parameterBean.isDisplayTextInList( );
	boolean allowMultiValue = !parameterBean.allowNewValues( ) && parameterBean.getParameter( ).isMultiValue( );
	List values = parameterBean.getValueList( );	

      out.write("\n");
      out.write("<TR>\n");
      out.write("\t<TD NOWRAP>\n");
      out.write("\t\t<IMG SRC=\"birt/images/parameter.gif\" ALT=\"");
      out.print( parameterBean.getDisplayName( ) );
      out.write("\" TITLE=\"");
      out.print( parameterBean.getToolTip( ) );
      out.write("\"/>\n");
      out.write("\t</TD>\n");
      out.write("\t<TD NOWRAP>\n");
      out.write("\t\t<FONT TITLE=\"");
      out.print( parameterBean.getToolTip( ) );
      out.write("\"><LABEL FOR=\"");
      out.print( encodedParameterName + "_selection");
      out.write('"');
      out.write('>');
      out.print( parameterBean.getDisplayName( ) );
      out.write(":</LABEL></FONT>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');

		if ( parameterBean.isRequired( ) )
		{
		
      out.write("\n");
      out.write("\t\t\t<FONT COLOR=\"red\"><LABEL FOR=\"");
      out.print( encodedParameterName + "_selection");
      out.write("\">*</LABEL></FONT>\n");
      out.write("\t\t");

		}
		
      out.write("\n");
      out.write("\t</TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("\t<TD NOWRAP></TD>\n");
      out.write("\t<TD NOWRAP WIDTH=\"100%\">\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\" ID=\"control_type\" VALUE=\"select\">\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\" ID=\"data_type\" VALUE=\"");
      out.print("" + parameterBean.getParameter( ).getDataType( ) );
      out.write("\">\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\"\n");
      out.write("\t\t\tID=\"");
      out.print( encodedParameterName + "_value" );
      out.write("\"\n");
      out.write("\t\t\tNAME=\"");
      out.print( encodedParameterName );
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( paramValue != null ? " VALUE=\"" + ParameterAccessor.htmlEncode( paramValue ) + "\"": "" );
      out.write("\n");
      out.write("\t\t>\n");
      out.write("\n");
	
	boolean CHECKED = true;
		
	if ( parameterBean.allowNewValues( ) ) // TODO: Editable
	{
		CHECKED = parameterBean.isValueInList( ) 
				  || paramValue == null
				  || ( !parameterBean.isValueInList( ) && defaultValue != null && defaultValue.equals( paramValue ) );		

      out.write("\n");
      out.write("\t\t<LABEL FOR=\"");
      out.print( encodedParameterName + "_radio_selection" );
      out.write("\" CLASS=\"birtviewer_hidden_label\">Select</LABEL>\n");
      out.write("\t\t<INPUT TYPE=\"RADIO\"\n");
      out.write("\t\t\tbirtParameterType=\"combobox\"\n");
      out.write("\t\t\tNAME=\"");
      out.print( encodedParameterName + "_radios" );
      out.write("\" \n");
      out.write("\t\t\tID=\"");
      out.print( encodedParameterName + "_radio_selection" );
      out.write("\" \n");
      out.write("\t\t\tVALUE=\"");
      out.print( encodedParameterName );
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( CHECKED ? "CHECKED" : "" );
      out.write(' ');
      out.write('>');
      out.write('\n');

	}

      out.write("\n");
      out.write("\t\t<SELECT ID=\"");
      out.print( encodedParameterName + "_selection");
      out.write("\"\n");
      out.write("\t\t\tTITLE=\"");
      out.print( parameterBean.getToolTip( ) );
      out.write("\"\n");
      out.write("\t\t\tCLASS=\"birtviewer_parameter_dialog_Select\"\n");
      out.write("\t\t\tbirtParameterType=\"combobox\" \n");
      out.write("\t\t\t");
      out.print( !CHECKED ? "DISABLED='true'" : "" );
      out.write(" \n");
      out.write("\t\t\t");
      out.print(  allowMultiValue? "multiple='true'" : "" );
      out.write("\n");
      out.write("\t\t\t");
      out.print( ( !parameterBean.allowNewValues( ) && parameterBean.isRequired( ) ) ? "aria-required='true'" : "" );
      out.write("\n");
      out.write("\t\t    >\n");

    boolean selectFirst = false;
	if ( parameterBean.getSelectionList( ) != null )
	{
		//TED 50195
		if( !parameterBean.isRequired( ) || ( (parameterBean.getValueList(  ) == null || parameterBean.getValueList(  ).size(  ) == 0) &&  DataUtil.trimString( defaultValue ).length( )<=0 ) )
		{
			if(parameterBean.isRequired( )){
				if(parameterBean.getSelectionList( )!=null && !parameterBean.getSelectionList( ).isEmpty(  )){
					/*
					ParameterSelectionChoice selectionItem = ( ParameterSelectionChoice )parameterBean.getSelectionList( ).get( 0 );						
					String label = selectionItem.getLabel( );
					String value = ( String ) selectionItem.getValue( );
					defaultValue = 	value;
					*/
					selectFirst = true;
				}
			}
				
			if( allowMultiValue && DataUtil.contain( values, "", true ) )
			{

      out.write("\n");
      out.write("\t\t<OPTION SELECTED></OPTION>\n");
				
			}
			else
			{

      out.write("\n");
      out.write("\t\t<OPTION></OPTION>\n");

			}
		}
		
		if ( DataUtil.trimString( defaultValue ).length( ) > 0 && !parameterBean.isDefaultValueInList( ) ) // Add default value in Combo Box
		{
			boolean flag = false;
			if( allowMultiValue )
			{
				flag = DataUtil.contain( values, defaultValue, true );
			}
			else
			{
				flag = CHECKED && !parameterBean.isValueInList( );
				// if displayText is in request, use it
				if( flag && parameterBean.isDisplayTextInReq( ) )
				{
					defaultDisplayText = displayText;
				}				
			}

      out.write("\n");
      out.write("\t\t\t<OPTION VALUE=\"");
      out.print( ParameterAccessor.htmlEncode( defaultValue ) );
      out.write("\" \n");
      out.write("\t\t\t        TITLE=\"");
      out.print( ParameterAccessor.htmlEncode( defaultDisplayText ) );
      out.write("\"\n");
      out.write("\t\t\t\t");
      out.print(  flag ? "SELECTED" : "" );
      out.write(' ');
      out.write('>');
      out.write(' ');
      out.print( ParameterAccessor.htmlEncode( defaultDisplayText ) );
      out.write("</OPTION>\n");
	
		}
		
		boolean isSelected = false;
		for ( int i = 0; i < parameterBean.getSelectionList( ).size( ); i++ )
		{
			ParameterSelectionChoice selectionItem = ( ParameterSelectionChoice )parameterBean.getSelectionList( ).get( i );						
			String label = selectionItem.getLabel( );
			String value = ( String ) selectionItem.getValue( );
			String outputValue = ParameterAccessor.htmlEncode(( value == null)?IBirtConstants.NULL_VALUE:value);
			String outputLabel = ParameterAccessor.htmlEncode(( label == null)?IBirtConstants.NULL_VALUE_DISPLAY:label);

			if( allowMultiValue )
			{
				if( DataUtil.contain( values, value, true ) )
				{

      out.write("\n");
      out.write("\t\t\t<OPTION VALUE=\"");
      out.print( outputValue );
      out.write("\"\n");
      out.write("\t\t\t        TITLE=\"");
      out.print( outputLabel );
      out.write("\"\n");
      out.write("\t\t\t        SELECTED>");
      out.print( outputLabel );
      out.write("</OPTION>\n");

					
				}
				else
				{

      out.write("\n");
      out.write("\t\t\t<OPTION VALUE=\"");
      out.print( outputValue );
      out.write("\"\n");
      out.write("\t\t\t        TITLE=\"");
      out.print( outputLabel );
      out.write('"');
      out.write('>');
      out.print( outputLabel );
      out.write("</OPTION>\n");
					
				}
			}
			else
			{
				if ( !isSelected && DataUtil.equals( paramValue, value ) 
					 && ( !isDisplayTextInList || ( isDisplayTextInList && DataUtil.equals(label, displayText ) )))
				{
					isSelected = true;				

      out.write("\n");
      out.write("\t\t\t<OPTION VALUE=\"");
      out.print( outputValue );
      out.write("\" \n");
      out.write("\t\t\t        TITLE=\"");
      out.print( outputLabel );
      out.write("\"\n");
      out.write("\t\t\t        SELECTED>");
      out.print( outputLabel );
      out.write("</OPTION>\n");

				}
				else
				{

      out.write("\n");
      out.write("\t\t\t<OPTION VALUE=\"");
      out.print( outputValue );
      out.write("\"\n");
      out.write("\t\t\t        TITLE=\"");
      out.print( outputLabel );
      out.write('"');
      out.write('>');
      out.print( outputLabel );
      out.write("</OPTION>\n");

				}
			}
		}
	}

      out.write("\n");
      out.write("\t\t</SELECT>\n");

	if ( parameterBean.allowNewValues( ) ) // TODO: editable.
	{

      out.write("\n");
      out.write("\t\t<BR>\n");
      out.write("\t\t<LABEL FOR=\"");
      out.print( encodedParameterName + "_radio_input" );
      out.write("\" CLASS=\"birtviewer_hidden_label\">Input</LABEL>\n");
      out.write("\t\t<INPUT TYPE=\"RADIO\"\n");
      out.write("\t\t\tbirtParameterType=\"combobox\"\n");
      out.write("\t\t\tNAME=\"");
      out.print( encodedParameterName + "_radios" );
      out.write("\" \n");
      out.write("\t\t\tID=\"");
      out.print( encodedParameterName + "_radio_input");
      out.write("\" \n");
      out.write("\t\t\tVALUE=\"");
      out.print( encodedParameterName );
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( !CHECKED ? "CHECKED" : "" );
      out.write(" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t<LABEL FOR=\"");
      out.print( encodedParameterName + "_input" );
      out.write("\" CLASS=\"birtviewer_hidden_label\">Input text</LABEL>\n");
      out.write("\t\t<INPUT CLASS=\"BirtViewer_parameter_dialog_Input\"\n");
      out.write("\t\t\tbirtParameterType=\"combobox\"\n");
      out.write("\t\t\tTYPE=\"");
      out.print( parameterBean.isValueConcealed( )? "PASSWORD" : "TEXT" );
      out.write("\"\n");
      out.write("\t\t\tTITLE=\"");
      out.print( parameterBean.getToolTip( ) );
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( !CHECKED ? "NAME=\"" + encodedParameterName + "_default\"": "" );
      out.write(" \n");
      out.write("\t\t\tID=\"");
      out.print( encodedParameterName + "_input");
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( !CHECKED && displayText != null ? "VALUE=\"" + ParameterAccessor.htmlEncode( displayText ) + "\"": "" );
      out.write(" \n");
      out.write("\t\t\t");
      out.print( CHECKED ? "DISABLED='true'" : "" );
      out.write("\t>\n");
      out.write("\t\t\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\"\n");
      out.write("\t\t\tID=\"");
      out.print( encodedParameterName + "_displayText" );
      out.write("\"\n");
      out.write("\t\t\t");
      out.print( !CHECKED && displayText != null ? "VALUE=\"" + ParameterAccessor.htmlEncode( displayText ) + "\"": "" );
      out.write(" \n");
      out.write("\t\t\t>\t\t\n");
      out.write("\t");

	  }
	
      out.write("\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\" ID=\"isRequired\" \n");
      out.write("\t\t\tVALUE = \"");
      out.print( parameterBean.isRequired( )? "true": "false" );
      out.write("\">\n");
      out.write("\t\t\t\n");
      out.write("\t");

	if ( parameterBean.isCascade( ) )
	{
	
      out.write("\n");
      out.write("\t\t<INPUT TYPE=\"HIDDEN\" ID=\"");
      out.print(IBirtConstants.IS_CASCADE);
      out.write("\" VALUE=\"true\"/>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

	//60078, 57264. If the parameterBean is not cascade, then select the first element.
	//64717, when preview in the report designer but not web, this page will load twice, 
	//and the second time has the seleted value, then skip select the first value.
	if ( selectFirst && !parameterBean.isCascade( ) && parameterBean.getValue( ) == null)
	{
	
      out.write("\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\tdocument.getElementById(\"");
      out.print( encodedParameterName + "_selection");
      out.write("\").options[1].selected = true;\n");
      out.write("\t\t</script>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t</TD>\n");
      out.write("</TR>");
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
