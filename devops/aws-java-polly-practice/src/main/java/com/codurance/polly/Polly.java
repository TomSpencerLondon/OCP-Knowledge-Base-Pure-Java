package com.codurance.polly;

import com.amazonaws.services.polly.AmazonPolly;
import com.amazonaws.services.polly.AmazonPollyClientBuilder;
import com.amazonaws.services.polly.model.OutputFormat;
import com.amazonaws.services.polly.model.TextType;
import com.amazonaws.services.polly.model.VoiceId;
import com.amazonaws.services.polly.presign.SynthesizeSpeechPresignRequest;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Polly {
  private final static String messagePrefix = "Hey team! This is a message from Tom Spencer:<break time=\"1s\"/> ";

  private final AmazonPolly polly = AmazonPollyClientBuilder.defaultClient();

  public String speak(String text) {
    var url = polly.presigners()
        .getPresignedSynthesizeSpeechUrl(new SynthesizeSpeechPresignRequest().withLanguageCode("en-GB")
        .withVoiceId(VoiceId.Brian)
            .withOutputFormat(OutputFormat.Mp3)
            .withText("<speak>" + messagePrefix + text + "</speak>")
            .withExpirationDate(new Date(currentTimeMillis() + 1000 * 60 * 60 * 24 * 3))
            .withTextType(TextType.Ssml)
        );

    return url.toString();
  }

  public static void main(String[] args) {
    var speak = new Polly().speak("Really enjoying working with AWS Community Builders!");
    System.out.println(speak);
  }
}
