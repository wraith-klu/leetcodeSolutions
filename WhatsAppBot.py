from fastapi import FastAPI, Form
from fastapi.responses import Response
from twilio.twiml.messaging_response import MessagingResponse
from datetime import datetime

app = FastAPI()

@app.get("/")
def home():
    return {"message": "WhatsApp Chatbot is running"}

@app.post("/bot")
def bot(Body: str = Form(...)):
    user_msg = Body.lower()

    resp = MessagingResponse()

    if "hi" in user_msg or "hello" in user_msg:
        resp.message("Hello! How can I help you?")
    elif "time" in user_msg:
        now = datetime.now().strftime("%H:%M:%S")
        resp.message("Current time is " + now)
    elif "bye" in user_msg:
        resp.message("Goodbye!")
    else:
        resp.message("I didn't understand. Please try again.")

    return Response(content=str(resp), media_type="application/xml")