/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-25 10:59:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mmall.model.SysUser;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/backend_common.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"no-skin\">\n");
      out.write("<div id=\"navbar\" class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"navbar-container\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle menu-toggler pull-left\" id=\"menu-toggler\">\n");
      out.write("            <span class=\"sr-only\">Toggle sidebar</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"navbar-header pull-left\">\n");
      out.write("            <a href=\"/admin/page.do\" class=\"navbar-brand\">\n");
      out.write("                <small>\n");
      out.write("                    <i class=\"fa fa-leaf\"></i>\n");
      out.write("                    管理员控制台\n");
      out.write("                </small>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-buttons navbar-header pull-right\" role=\"navigation\">\n");
      out.write("            <ul class=\"nav ace-nav\">\n");
      out.write("                <li class=\"light-blue dropdown-modal\">\n");
      out.write("                    <a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("                        <span class=\"user-info\">\n");
      out.write("                            <small>欢迎,</small>\n");
      out.write("                            Admin\n");
      out.write("                        </span>\n");
      out.write("                        <i class=\"ace-icon fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"> <i class=\"ace-icon fa fa-cog\"></i>\n");
      out.write("                                设置\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"profile.html\"> <i class=\"ace-icon fa fa-user\"></i>\n");
      out.write("                                个人资料\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/logout.page\"> <i class=\"ace-icon fa fa-power-off\"></i>\n");
      out.write("                                注销\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"main-container\" id=\"main-container\">\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        try {\n");
      out.write("            ace.settings.check('main-container', 'fixed')\n");
      out.write("        } catch (e) {\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <div id=\"sidebar\" class=\"sidebar responsive\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            try {\n");
      out.write("                ace.settings.check('sidebar', 'fixed')\n");
      out.write("            } catch (e) {\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ul class=\"nav nav-list\">\n");
      out.write("            <li class=\"active\">\n");
      out.write("                <a class=\"popstyle\" href=\"/sys/user/page.do\" target=\"_blank\">\n");
      out.write("                    <i class=\"menu-icon fa fa-tachometer\"></i>\n");
      out.write("                    <span class=\"menu-text\"> 首页 </span>\n");
      out.write("                </a>\n");
      out.write("                <b class=\"arrow\"></b>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("                    <i class=\"menu-icon fa fa-desktop\"></i>\n");
      out.write("                    <span class=\"menu-text\"> 权限管理 </span>\n");
      out.write("                    <b class=\"arrow fa fa-angle-down\"></b>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <b class=\"arrow\"></b>\n");
      out.write("\n");
      out.write("                <ul class=\"submenu\">\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a class=\"popstyle\" href=\"/sys/dept/dept.page\" target=\"_blank\">\n");
      out.write("                            <i class=\"menu-icon fa fa-caret-right\"></i>\n");
      out.write("                            用户管理\n");
      out.write("                        </a>\n");
      out.write("                        <b class=\"arrow\"></b>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a class=\"popstyle\" href=\"/sys/role/role.page\" target=\"_blank\">\n");
      out.write("                            <i class=\"menu-icon fa fa-caret-right\"></i>\n");
      out.write("                            角色管理\n");
      out.write("                        </a>\n");
      out.write("                        <b class=\"arrow\"></b>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a class=\"popstyle\" href=\"/sys/aclModule/acl.page\" target=\"_blank\">\n");
      out.write("                            <i class=\"menu-icon fa fa-caret-right\"></i>\n");
      out.write("                            权限管理\n");
      out.write("                        </a>\n");
      out.write("                        <b class=\"arrow\"></b>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a class=\"popstyle\" href=\"/sys/log/log.page\" target=\"_blank\">\n");
      out.write("                            <i class=\"menu-icon fa fa-caret-right\"></i>\n");
      out.write("                            权限更新记录\n");
      out.write("                        </a>\n");
      out.write("                        <b class=\"arrow\"></b>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("                    <i class=\"menu-icon fa fa-desktop\"></i>\n");
      out.write("                    <span class=\"menu-text\"> 系统管理 </span>\n");
      out.write("                    <b class=\"arrow fa fa-angle-down\"></b>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <b class=\"arrow\"></b>\n");
      out.write("\n");
      out.write("                <ul class=\"submenu\">\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a class=\"popstyle\" href=\"/config/config.page\" target=\"_blank\">\n");
      out.write("                            <i class=\"menu-icon fa fa-caret-right\"></i>\n");
      out.write("                            全局配置管理\n");
      out.write("                        </a>\n");
      out.write("                        <b class=\"arrow\"></b>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- /.nav-list -->\n");
      out.write("\n");
      out.write("        <div class=\"sidebar-toggle sidebar-collapse\" id=\"sidebar-collapse\">\n");
      out.write("            <i class=\"ace-icon fa fa-angle-double-left\" data-icon1=\"ace-icon fa fa-angle-double-left\"\n");
      out.write("               data-icon2=\"ace-icon fa fa-angle-double-right\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            try {\n");
      out.write("                ace.settings.check('sidebar', 'collapsed')\n");
      out.write("            } catch (e) {\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("        <iframe id=\"innerFrame\" src=\"/sys/dept/dept.page\" width=\"99%\" style=\"min-height: 768px;\"></iframe>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.main-content -->\n");
      out.write("\n");
      out.write("    <a href=\"index.html#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse display\">\n");
      out.write("        <i class=\"ace-icon fa fa-angle-double-up icon-only bigger-110\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /.main-container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- basic scripts -->\n");
      out.write("\n");
      out.write("<!--[if !IE]> -->\n");
      out.write("<script src=\"/assets/js/jquery-2.1.0.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- <![endif]-->\n");
      out.write("\n");
      out.write("<!--[if IE]>\n");
      out.write("<script src=\"/assets/js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<!--[if !IE]> -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.jQuery || document.write(\"<script src='/assets/js/jquery.min.js'>\" + \"<\" + \"/script>\");\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- <![endif]-->\n");
      out.write("\n");
      out.write("<!--[if IE]>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.jQuery || document.write(\"<script src='/assets/js/jquery1x.min.js'>\" + \"<\" + \"/script>\");\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- page specific plugin scripts -->\n");
      out.write("\n");
      out.write("<!--[if lte IE 8]>\n");
      out.write("<script src=\"/assets/js/excanvas.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<script src=\"/assets/js/jquery-ui.custom.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/jquery.easypiechart.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/jquery.sparkline.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/flot/jquery.flot.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- ace scripts -->\n");
      out.write("<script src=\"/assets/js/ace-elements.min.js\"></script>\n");
      out.write("<script src=\"/assets/js/ace.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\".popstyle\").removeAttr(\"target\");\n");
      out.write("        $(\".popstyle\").each(function () {\n");
      out.write("            var $this = $(this)\n");
      out.write("            tmp = $this.attr(\"href\");\n");
      out.write("            $this.attr(\"data\", tmp);\n");
      out.write("            $this.attr(\"href\", \"javascript:void(0)\");\n");
      out.write("        })\n");
      out.write("\n");
      out.write("        $(\".popstyle\").click(function () {\n");
      out.write("            var $this = $(this)\n");
      out.write("            $(\"iframe\").attr(\n");
      out.write("                    'src',\n");
      out.write("                    $this.attr(\"data\")\n");
      out.write("            );\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\".direct\").click(function () {\n");
      out.write("            var $this = $(this)\n");
      out.write("            $(\"iframe\").attr(\n");
      out.write("                    'src',\n");
      out.write("                    $this.attr(\"data-value\")\n");
      out.write("            );\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
