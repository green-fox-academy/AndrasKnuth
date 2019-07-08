package greenfox.movie.authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class JWTGenerate {

  private static final String SECRET_KEY = "itisasecretiguessitisasecretiguessitisasecretiguess"
      + "itisasecretiguessitisasecretiguessitisasecretiguessitisasecretiguessitisasecretiguess";

  public static String createJWT(String id, String issuer, String subject) {

    //The JWT signature algorithm we will be using to sign the token
    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

    long nowMillis = System.currentTimeMillis();
    Date now = new Date(nowMillis);

    //We will sign our JWT with our ApiKey secret
    byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
    Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

    //Let's set the JWT Claims
    JwtBuilder builder = Jwts.builder().setId(id)
        .setIssuedAt(now)
        .setSubject(subject)
        .setIssuer(issuer)
        .setExpiration(new Date(System.currentTimeMillis() + (1000 * 30)))
        .signWith(signatureAlgorithm, signingKey);

    //Builds the JWT and serializes it to a compact, URL-safe string
    return builder.compact();
  }

  public static Claims decodeJWT(String jwt) {
    //This line will throw an exception if it is not a signed JWS (as expected)
    Claims claims = Jwts.parser()
        .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
        .parseClaimsJws(jwt).getBody();
    return claims;
  }
}
