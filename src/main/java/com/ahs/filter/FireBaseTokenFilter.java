//package com.ahs.filter;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.auth.FirebaseToken;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.filter.OncePerRequestFilter;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.io.IOException;
//
//public class FireBaseTokenFilter extends OncePerRequestFilter {
//
//    /**
//     * Authenticating user via fireBase authorizer verify fireBase token and extract
//     * Uid and Email from token
//     */
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
//
//        //Extracts token from header
//        String token = request.getHeader("Authorization");
//
//        //checks if token is there
//        if (token == null )
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Missing token!");
//
//        FirebaseToken decodedToken = null;
//        try {
//            //verifies token to firebase server
//            decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
//        } catch (FirebaseAuthException e) {
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Error! "+e.toString());
//        }
//        //if token is invalid
//        if (decodedToken==null){
//            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Invalid token!");
//        }
//
//        //Extract Uid and Email
//        String uid= decodedToken.getUid();
//        //String emailId = decodedToken.getEmail();
//
//    /*
//    //set Uid and Email to request
//    void setAttribute(java.lang.String name, java.lang.Object o)
//    */
//
//        request.setAttribute("uid", uid);
//        //request.setAttribute("email”, emailId);
//
//        chain.doFilter(request,response);
//    }
//}
