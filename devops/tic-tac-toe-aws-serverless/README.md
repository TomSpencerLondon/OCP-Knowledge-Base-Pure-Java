# Next React Tic Tac Toe Demo
This is the repository for this tutorial with Brian, Shubham and Parth. [Here](https://www.youtube.com/watch?v=XinxFNHHecM)!

For this application we followed [Learn Next.js](https://nextjs.org/learn):
```
npx create-next-app nextjs-blog --use-npm --example "https://github.com/vercel/next-learn-starter/tree/master/learn-starter"
```
and added code from [this tutorial](https://reactjs.org/tutorial/tutorial.html).
We then ran:
```
export AWS_PROFILE=<your_profile>
```
It is important to set up your profile inside credentials within ~/.aws folder:
```
[default]
aws_access_key_id = YOUR_AWS_ACCESS_KEY_ID
aws_secret_access_key = YOUR_AWS_SECRET_ACCESS_KEY

[project1]
aws_access_key_id = ANOTHER_AWS_ACCESS_KEY_ID
aws_secret_access_key = ANOTHER_AWS_SECRET_ACCESS_KEY
```
Instructions are [here](https://docs.aws.amazon.com/sdk-for-php/v3/developer-guide/guide_credentials_profiles.html).

Finally, we run:
```
npm run deploy
```
which runs sls (short for ```serverless deploy```). [Tutorial here](https://www.serverless.com/framework/docs/providers/aws/cli-reference/deploy/).
