<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Font Awesome -->
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
      rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
      rel="stylesheet"
    />


    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<!-- Template CSS -->
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/js/script.js">

    <title>Registration Form!</title>
  </head>
  <body>
   <%-- Display success message if present --%>

    <!--<div class="alert alert-success mb-0 alert-dismissible alert-absolute fade show " id="alertExample" role="alert" data-mdb-color="secondary">
      <i class="fas fa-check me-2"></i>
      ${successMessage}
      <button type="button" class="btn-close ms-2" data-mdb-dismiss="alert" aria-label="Close"></button>
    </div>-->

    <section class="vh-100 bg-image"
      style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
      <div class="mask d-flex align-items-center h-100 gradient-custom-3">
        <div class="container h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-9 col-lg-7 col-xl-6">
              <div class="card" style="border-radius: 15px;">
                <div class="card-body p-5">
                  <h2 class="text-uppercase text-center mb-5">Register Your Account</h2>

                  <form action="loginpage" method="post">
                    <div class="form-outline mb-4">
                     <label class="form-label" for="form3Example1cg">User Name</label>
                      <input type="text" id="form3Example1cg" class="form-control form-control-lg" name="userName"/>
                    </div>

                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example3cg">Email</label>
                      <input type="email" id="form3Example3cg" class="form-control form-control-lg" name="email"/>
                    </div>

                    <div class="form-outline mb-4">
                      <label class="form-label" for="form3Example4cg">Password</label>
                      <input type="password" id="form3Example4cg" class="form-control form-control-lg" name="password"/>

                    </div>

                   <!-- <div class="form-outline mb-4">
                      <label class="form-label" for="form3Example4cdg">Repeat your password</label>
                      <input type="password" id="form3Example4cdg" class="form-control form-control-lg"/>
                    </div> -->

                    <div class="form-check d-flex justify-content-center mb-5">
                      <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3cg"/>
                      <label class="form-check-label" for="form2Example3g">
                        I agree all statements in <a href="#!" class="text-body"><u>Terms of service</u></a>
                      </label>
                    </div>

                    <div class="d-flex justify-content-center">
                      <button type="submit"
                        class="btn btn-primary btn-block btn-lg gradient-custom-4 text-body">Register</button>
                    </div>

                    <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="#!"
                        class="fw-bold text-body"><u>Login here</u></a></p>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
   <!-- <form action="processed" method="post">
         <div class="mb-3">
           <label for="exampleInputEmail1" class="form-label">Email address</label>
           <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
         </div>
         <div class="mb-3">
             <label for="exampleInputUserName1" class="form-label">User name</label>
             <input type="text" class="form-control" id="exampleInputUserName1" name="userName">
          </div>
         <div class="mb-3">
           <label for="exampleInputPassword1" class="form-label">Password</label>
           <input type="password" class="form-control" id="exampleInputPassword1" name="password">
         </div>

         <button type="submit" class="btn btn-primary">Submit</button>
       </form> -->


    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->

   <!-- MDB -->
   <script
     type="text/javascript"
     src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.3.1/mdb.min.js"
   ></script>
  </body>
</html>