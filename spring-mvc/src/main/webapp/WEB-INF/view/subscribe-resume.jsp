<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>DEMO SPRING MVC</title>
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/img/favicon.ico" />
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
</head>
<body id="page-top">
<!-- Masthead-->
<header class="masthead">
    <div class="container d-flex h-100 align-items-center">
        <div class="mx-auto text-center">
            <h1 class="mx-auto my-0 text-uppercase">Subscribe</h1>
            <h2 class="text-white-50 mx-auto mt-2 mb-5">${param.email}</h2>
            <h2 class="text-white-50 mx-auto mt-2 mb-5">Welcome ${user}</h2>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium, ad aperiam asperiores, at dolores excepturi exercitationem ipsum iste reiciendis tempore voluptatem, voluptatibus. Architecto cum ducimus hic magni perspiciatis tempore tenetur?
            </p>
            <a class="btn btn-primary js-scroll-trigger" href="${pageContext.request.contextPath}/">Return Home</a>
        </div>
    </div>
</header>
<!-- Footer-->
<footer class="footer bg-black small text-center text-white-50"><div class="container">Copyright © Your Website 2020</div></footer>
<!-- Bootstrap core JS-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Third party plugin JS-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
<!-- Core theme JS-->
<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>
