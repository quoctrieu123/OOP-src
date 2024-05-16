
from flask import Flask,redirect,url_for,render_template,request,session,jsonify
from Search_full_code import *
import json
from datetime import timedelta
app = Flask(__name__)

@app.route("/data",methods=["POST"])
def get_data():
    data = request.get_json()
    if not data or 'input' not in data or 'type' not in data:
        return jsonify({'error': 'Invalid input, please provide both input and type.'}), 400
    input_value = data['input']
    type_value = data['type']
    respond= search_algo(input_value,type_value)
    return jsonify(respond)

@app.route("/recent",methods=["POST"])
def recent():
    type = request.data.decode("UTF8")
    respond= recent_articles(type)
    return jsonify(respond)

if __name__ =="__main__":

    app.run(debug=True)
    