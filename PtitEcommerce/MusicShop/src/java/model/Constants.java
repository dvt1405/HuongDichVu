/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class Constants {

    public static String FACEBOOK_APP_ID = "444755806280822";
    public static String FACEBOOK_APP_SECRET = "ee476b13e451561a1ee15ed5b2e0ec88";
    public static String FACEBOOK_REDIRECT_URL = "https://88774f1b.ngrok.io/MusicShop/loginfb";
    public static String FACEBOOK_LINK_GET_TOKEN = "https://graph.facebook.com/oauth/access_token?client_id=%s&client_secret=%s&redirect_uri=%s&code=%s";
    
    public static String GOOGLE_CLIENT_ID = "482864950284-nlvbldolgt2f4ptiqmkvsp2gdbd4j5qg.apps.googleusercontent.com";
    public static String GOOGLE_CLIENT_SECRET = "9-LjlUcOolKwzGsVKIxkTsZT";
    public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
    public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
    public static String GOOGLE_GRANT_TYPE = "authorization_code";
    public static String GOOGLE_REDIRECT_URI = "http://localhost:8080/MusicShop/LoginGoogleServlet";

}
