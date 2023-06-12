<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <!-- Template CSS -->
        <link rel="stylesheet" href="/css/welcome.css">
        <script src="/js/script.js"></script>


    <title>Wel Come Page!</title>
  </head>
  <body>
  <div class="container-xl">
      <div class="table-responsive">
          <div class="table-wrapper">
              <div class="table-title">
                  <div class="row">
                      <div class="col-sm-4">
                          <div class="show-entries">
                              <span>Show</span>
                              <select>
                                  <option>5</option>
                                  <option>10</option>
                                  <option>15</option>
                                  <option>20</option>
                              </select>
                              <span>entries</span>
                          </div>
                      </div>
                      <div class="col-sm-4">
                          <h2 class="text-center">Users <b>Details</b></h2>
                      </div>
                      <div class="col-sm-4">
                          <div class="search-box">
                              <div class="input-group">
                                  <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                                  <input type="text" class="form-control" placeholder="Search&hellip;">
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <table class="table table-bordered">
                  <thead>

                      <tr>
                          <th>#</th>
                          <th>Name <i class="fa fa-sort"></i></th>
                          <th>Email</th>
                          <th>Actions</th>
                      </tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${users}" var="user">
                      <tr>
                          <td>${user.id}</td>
                          <td>${user.userName}</td>
                          <td>${user.email}</td>
                          <td>
                              <a href="#" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a>
                              <a href="http://localhost:8080/api/v1/users/updated/${user.id}" class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                              <a href="http://localhost:8080/api/v1/users/deleted/${user.id}" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                          </td>
                      </tr>
                  </c:forEach>
                  </tbody>
              </table>
              <div class="clearfix">
                  <div class="hint-text">Users entries :  <b>${usercount}</b></div>
                  <ul class="pagination">
                      <li class="page-item disabled"><a href="#">Previous</a></li>
                      <li class="page-item"><a href="#" class="page-link" class="page-link">1</a></li>
                      <li class="page-item"><a href="#" class="page-link">2</a></li>
                      <li class="page-item active"><a href="#" >3</a></li>
                      <li class="page-item"><a href="#" class="page-link">4</a></li>
                      <li class="page-item"><a href="#" class="page-link">5</a></li>
                      <li class="page-item"><a href="#" class="page-link">Next</a></li>
                  </ul>
              </div>
          </div>
      </div>
  </div>


  <!-- <table class="table table-dark table-striped" id="table">
    		<thead>
    			<tr>
    				<th>ID</th>
    				<th>Name</th>
    				<th>Email</th>
    				<th>Password</th>
    			</tr>
    		</thead>
    		<tbody class="table-striped">
    			<c:forEach items="${users}" var="user">
    				<tr>
    					<td>${user.id}</td>
    					<td>${user.userName}</td>
    					<td>${user.email}</td>
                        <td>${user.password}</td>
    					<td><a class="btn btn-warning" href="http://localhost:8080/deleted?id=${user.id}">Delete</a>
    						<a class="btn btn-success" href="http://localhost:8080/update?id=${user.id}">Edit</a></td>
    				</tr>
    			</c:forEach>
    		</tbody>
    	</table>-->
 </body>
</html>