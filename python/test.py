from mlforkids import MLforKidsImageProject

# treat this key like a password and keep it secret!
key = "86463170-51cf-11ec-bef0-c7d864c3f435757faecc-6b8d-4838-8d7d-e4f108f7f872"

# this will train your model and might take a little while
myproject = MLforKidsImageProject(key)
myproject.train_model()

# CHANGE THIS to the image file you want to recognize
demo = myproject.prediction("my-test-image.jpg")

label = demo["class_name"]
confidence = demo["confidence"]

# CHANGE THIS to do something different with the result
print ("result: '%s' with %d%% confidence" % (label, confidence))