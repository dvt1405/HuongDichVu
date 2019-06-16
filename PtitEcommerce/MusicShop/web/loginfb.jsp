<%-- 
    Document   : loginfb
    Created on : Apr 11, 2019, 12:49:40 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
</head>
<body>
  <h1>login</h1>
  <a href="https://www.facebook.com/dialog/oauth?client_id=444755806280822&redirect_uri=https://88774f1b.ngrok.io/MusicShop/loginfb">Login Facebook</a>
<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
</fb:login-button>
  
  <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/MusicShop/LoginGoogleServlet&response_type=code
    &client_id=482864950284-nlvbldolgt2f4ptiqmkvsp2gdbd4j5qg.apps.googleusercontent.com&approval_prompt=force">Login With Google</a>  

<div id="status">
</div>
</body>

<script>
  function statusChangeCallback(response) {
    console.log('statusChangeCallback');
    console.log(response);
    if (response.status === 'connected') {
      testAPI();
    } else {
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    }
  }

  function checkLoginState() {
    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });
  }

  window.fbAsyncInit = function() {
    FB.init({
      appId      : '444755806280822',
      cookie     : true, 
      xfbml      : true,  
      version    : 'v3.3' 
    });

    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });

  };

  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));

  function testAPI() {
    console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) {
      console.log('Successful login for: ' + response.name);
      var name = response.name;
      document.getElementById('status').innerHTML =
        'Thanks for logging in, ' + name + '!';
      window.location="http://localhost:8080/MusicShop/loginfb?name="+name+"&id="+response.id;
    });
    
  }
</script>
</html>
