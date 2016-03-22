# Android-notification-using-Batch
This project is example using Batch for notification
see documentation https://batch.com/doc

How to using this project ?
```
Fill in GCM_SENDER_ID and BATCH_API_KEY on Class App
Batch.Push.setGCMSenderId("GCM_SENDER_ID");

// TODO : switch to live Batch Api Key before shipping
Batch.setConfig(new Config("BATCH_API_KEY")); // developement
```
