package com.codurance.sns;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

import static java.lang.System.getenv;

public class Notifier {
  private final static String TOPIC_ARN = getenv("TOPIC_ARN");
  private final static String RECIPIENTS = getenv("RECIPIENTS");
  private final static String FROM = getenv("FROM");
  private final static String SUBJECT = "Check out this email!";
  private final static String CHARSET = "UTF-8";

  private final static String BODY_HTML = "<html><head></head><body>"
      + "Hi please do checkout this link:<br>"
      + "<a href=\"${link}\">Click here</a></body></html>";

  private final AmazonSNS sns = AmazonSNSClientBuilder.defaultClient();
  private final AmazonSimpleEmailService ses = AmazonSimpleEmailServiceClientBuilder.standard()
      .build();

  public void send(String linkAsMessage) throws Exception {
    sns.publish(TOPIC_ARN, "This is an email");

    for (var recipient : RECIPIENTS.split(",")) {
      ses.sendEmail(createEmailRequest(linkAsMessage, recipient));
    }
  }

  private static SendEmailRequest createEmailRequest(String link, String recipient) throws Exception {
    return new SendEmailRequest().withDestination(new Destination().withToAddresses(recipient))
        .withMessage(new Message()
        .withBody(new Body().withHtml(
            new Content()
                .withCharset(CHARSET)
                .withData(BODY_HTML
                    .replace("${link}", link)))
        ).withSubject(
            new Content()
                .withCharset(CHARSET)
                .withData(SUBJECT))
        ).withSource(FROM);
  }


  public static void main(String[] args) throws Exception {
    new Notifier().send("https://www.google.com");
  }
}
