/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-02-28 02:05:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Board;
import java.util.ArrayList;
import java.sql.Date;
import member.model.vo.Member;

public final class boardListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/header.jsp", Long.valueOf(1550807214933L));
    _jspx_dependants.put("/views/board/../common/footer.html", Long.valueOf(1550806130233L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"boardError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	
	Member loginMember = (Member)session.getAttribute("loginMember");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>first</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\ta { text-decoration: none; color: black;}\r\n");
      out.write("\t\t\ttable td.title { text-align: left; }\r\n");
      out.write("\t\t\ttable th { background: pink;}\r\n");
      out.write("\t\t\ttable { border: 1px solid black; border-collapse: collapse; width: 700px;}\r\n");
      out.write("\t\t\ttable th, td { border: 1px solid black; text-align: center; padding: 10px 5px 10px 5px; }\r\n");
      out.write("\t\t\tbutton{\r\n");
      out.write("\t\t\t  background:pink;;\r\n");
      out.write("\t\t\t  color: black;\r\n");
      out.write("\t\t\t  border:1px solid #ddd;\r\n");
      out.write("\t\t\t  position:relative;\r\n");
      out.write("\t\t\t  height:45px;\r\n");
      out.write("\t\t\t  font-size:1em;\r\n");
      out.write("\t\t\t  padding:0 2em;\r\n");
      out.write("\t\t\t  cursor:pointer;\r\n");
      out.write("\t\t\t  transition:800ms ease all;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton:hover{\r\n");
      out.write("\t\t\t  background:#fff;\r\n");
      out.write("\t\t\t  color:pink;\r\n");
      out.write("\t\t\t  border: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton:before,button:after{\r\n");
      out.write("\t\t\t  content:'';\r\n");
      out.write("\t\t\t  position:absolute;\r\n");
      out.write("\t\t\t  top:0;\r\n");
      out.write("\t\t\t  right:0;\r\n");
      out.write("\t\t\t  height:2px;\r\n");
      out.write("\t\t\t  width:0;\r\n");
      out.write("\t\t\t  background: pink;\r\n");
      out.write("\t\t\t  transition:400ms ease all;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton:after{\r\n");
      out.write("\t\t\t  right:inherit;\r\n");
      out.write("\t\t\t  top:inherit;\r\n");
      out.write("\t\t\t  left:0;\r\n");
      out.write("\t\t\t  bottom:0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbutton:hover:before,button:hover:after{\r\n");
      out.write("\t\t\t  width:100%;\r\n");
      out.write("\t\t\t  transition:800ms ease all;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction showWriteForm(){\r\n");
      out.write("\t\t\t\tlocation.href = \"/first/views/board/boardWriteForm.jsp\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>first</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\tul {\r\n");
      out.write("\t\t\t\tlist-style: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tul li {\r\n");
      out.write("\t\t\t\tfloat: left;\r\n");
      out.write("\t\t\t\tmargin-right: 5px;\r\n");
      out.write("\t\t\t\tbackground: skyblue;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tul li a {\r\n");
      out.write("\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tpadding-top: 5px;\r\n");
      out.write("\t\t\t\tpadding-bottom: 0;\r\n");
      out.write("\t\t\t\tdisplay: block;\r\n");
      out.write("\t\t\t\twidth: 100px;\r\n");
      out.write("\t\t\t\theight: 35px;\r\n");
      out.write("\t\t\t\tcolor: navy;\r\n");
      out.write("\t\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tul li a:hover {\r\n");
      out.write("\t\t\t\tbackground: navy;\r\n");
      out.write("\t\t\t\ttext-shadow: 1px 1px 2px white;\r\n");
      out.write("\t\t\t\tbox-shadow: 2px 2px 4px gray;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<h1>first</h1>\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/first/index.jsp\">home</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/first/nlist\">공지사항</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/first/blist?page=1\">게시글</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">앨범</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">자료실</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<hr style=\"clear:both;\">\r\n");
      out.write("\t\t<h2 align=\"center\">게시글 목록</h2>\r\n");
      out.write("\t\t<h4 align=\"center\">\r\n");
      out.write("\t\t\t총 게시글 개수 : ");
      out.print( listCount );
      out.write("\r\n");
      out.write("\t\t</h4>\r\n");
      out.write("\t\t");
 if(loginMember != null){ //로그인 상태라면 
      out.write("\r\n");
      out.write("\t\t\t<div style=\"align: center; text-align: center;\">\r\n");
      out.write("\t\t\t\t<button onclick=\"showWriteForm()\">글쓰기</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>번호</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t<th>날짜</th>\r\n");
      out.write("\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t<th>첨부파일</th>\r\n");
      out.write("\t\t\t\t");
 for(Board b : list){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( b.getBoardNum() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"title\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(b.getBoardReplyLevel() == 1){ //원글의 댓글일 때 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; &nbsp; ┗\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else if(b.getBoardReplyLevel() == 2){ //댓글의 댓글일 때
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; &nbsp; &nbsp; &nbsp; ┗┗\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/first/bdetail?bnum=");
      out.print( b.getBoardNum() );
      out.write("&page=");
      out.print( currentPage );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print( b.getBoardTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( b.getBoardTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( b.getBoardWriter() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( b.getBoardDate() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( b.getBoardReadcount() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(b.getOriginalFileName() != null){ //첨부파일이 있다면 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t＆\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t");
 if(currentPage == 1){ 
      out.write("\r\n");
      out.write("\t\t\t\t[맨처음]&nbsp;\r\n");
      out.write("\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/first/blist?page=1\">\r\n");
      out.write("\t\t\t\t\t[맨처음]&nbsp;\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if((currentPage - 10) < startPage && (currentPage - 10) > 1){ //이전페이지그룹이 있다면 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/first/blist?page=");
      out.print( startPage - 10 );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t[이전]&nbsp;\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t");
 }else{ //이전페이지그룹이 없다면 
      out.write("\r\n");
      out.write("\t\t\t\t[이전]&nbsp;\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
 for(int p = startPage; p <= endPage; p++){
				if(p == currentPage) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<font color=\"pink\" size=\"4\">\r\n");
      out.write("\t\t\t\t\t\t<b>[");
      out.print( p );
      out.write("]</b>\r\n");
      out.write("\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/first/blist?page=");
      out.print( p );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t[");
      out.print( p );
      out.write("]\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t");
 } //else close
				} //for close 
      out.write("\r\n");
      out.write("\t\t\t");
 if((currentPage + 10) > endPage && (currentPage + 10) < maxPage){ //다음페이지그룹이 있다면
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/first/blist?page=");
      out.print( endPage + 10 );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t[다음]&nbsp;\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t");
 }else{ //다음페이지그룹이 없다면
      out.write("\r\n");
      out.write("\t\t\t\t[다음]&nbsp;\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("\t\t\t\t[맨끝]&nbsp;\r\n");
      out.write("\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/first/blist?page=");
      out.print( maxPage );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t[맨끝]&nbsp;\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>first</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\tfooter {\r\n");
      out.write("\t\t\t\tbackground: navy;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\theight: 70px;\r\n");
      out.write("\t\t\t\tpadding-top: 15px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<h5 align=\"center\">\r\n");
      out.write("\t\t\t\t&copy;2019.02.22 kh.org<br>\r\n");
      out.write("\t\t\t\ttel : 02-1234-5678 &nbsp; &nbsp;\r\n");
      out.write("\t\t\t\tfax : 02-1234-7890\r\n");
      out.write("\t\t\t</h5>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
