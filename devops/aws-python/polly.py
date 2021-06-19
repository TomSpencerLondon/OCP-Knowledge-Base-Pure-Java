# Explicit Client Configuration
import boto3

def polly_call():
    polly = polly = boto3.client( 'polly', region_name='eu-west-1')
    result = polly.synthesize_speech(
        Text='Hello World!',
        OutputFormat='mp3',
        VoiceId='Aditi')

    # Save the Audio from the response
    audio = result['AudioStream'].read()
    with open("helloworld.mp3","wb") as file:
        file.write(audio)