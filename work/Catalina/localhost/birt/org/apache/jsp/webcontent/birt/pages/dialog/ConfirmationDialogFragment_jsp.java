/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2023-02-09 11:15:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webcontent.birt.pages.dialog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.birt.report.presentation.aggregation.IFragment;
import org.eclipse.birt.report.resource.ResourceConstants;
import org.eclipse.birt.report.resource.BirtResources;

public final class ConfirmationDialogFragment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("org.eclipse.birt.report.resource.ResourceConstants");
    _jspx_imports_classes.add("org.eclipse.birt.report.resource.BirtResources");
    _jspx_imports_classes.add("org.eclipse.birt.report.presentation.aggregation.IFragment");
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
      out.write("\n");
      out.write("<TABLE CELLSPACING=\"2\" CELLPADDING=\"2\" CLASS=\"birtviewer_dialog_body\">\n");
      out.write("\t<TR>\n");
      out.write("\t\t<TD VALIGN=\"bottom\" ALIGN=\"center\">\n");
      out.write("\t\t\t<TABLE CELLSPACING=\"2\" CELLPADDING=\"2\">\n");
      out.write("\t\t\t\t<TR>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<iframe name=\"birt_confirmation_iframe\" \n");
      out.write("\t\t\t\t\t\t\tclass=\"birtviewer_confirmation_dialog_iframe\" \n");
      out.write("\t\t\t\t\t\t\tframeBorder=\"0\" src=\"");
      out.print( "birt/pages/common/processing.jsp?__rtl=" + Boolean.toString( attributeBean.isRtl() )  );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</iframe>\t\t\t\n");
      out.write("\t\t\t\t\t</TD>\t\t\t\t\t\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</TD>\n");
      out.write("\t</TR>\n");
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
