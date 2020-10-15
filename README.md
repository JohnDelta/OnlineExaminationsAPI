# JuniorWorkersAPI

Restfull API provider for the Junior Workers project

The current API is written is PHP and I'm transferring it to Java.

Junior Workers main project can be found at https://github.com/JohnDelta/junior_workers

## About
junior workers

# Build Info

### Maven project | dynamic web module 4

## Requirements
- JDK 1.8+
- Maven 3.8+

## dependencies
- jaxrs Jersey
- org.json
- MySQL connector java
- jjwt

## Setup the MySQL Database (DB name: junior_workers, User: juniorworkers_user, Password: juniorworkers_password)
- Localhost mysql server is set to localhost:3306. Change it from com.junior_workers.database_controllers.Database.java if you use a different host
- Login to MySQL command line
- Find the folder: JuniorWorkersAPI/DatabaseScript/script.sql and run it to your MySQL command line to create the database
- Create a new controller account for the new database

` create user 'juniorworkers_user'@'%' identified by 'juniorworkers_password'; `

- Give user the necessary privileges

` grant all on junior_workers.* to 'juniorworkers_user'@'%'; `

## Install API (setup DB first required)
- clone the project to a location and open it

` git clone https://github.com/JohnDelta/9laugh_api.git `

` cd 9laugh_api `

- build and run the project locally on your local server
	
# API Requests (local testing server: localhost:8080/api)

* be careful with the key naming convention. It's been changed to match
	the junior-workers's old PHP API 

## login
- url: localhost:8080/api/user/login
- method: POST
- content-type: application/json
- body: ` {username: "", password: ""} `
- returns: application/json

## account create
- url: localhost:8080/api/user/create
- method: POST
- content-type: application/json
- body:

```
 	{
		"email": "", 
		"password": "",
		"firstname": "",
		"lastname": "",
		"role": "" ("candidate" or "hirer")
	}
```
 
- returns: application/json

## update account (role: candidate)
- *All object keys must be presented. If they're empty or null or negative they won't update any values
- url: localhost:8080/api/user/update
- method: POST
- content-type: application/json
- body:
 
```  
	{
		"jwt": "jwt key"
		"user": {
			"firstname": "",
			"lastname": "",
			"availability": "",
			"title": "",
			"bio": "",
			"image_path": "",
			"video_path": "",
			"resume_path": ""
		},
		"skill": [
			{
				"title": "",
				"id_skill": ""
			},
		],
		"language": [
			{
				"title": "",
				"id_language": "",
				"language_level": {
					"id_language_level": "",
					"title": ""
				}
			},
		],
		"education": [
			{
				"title": "",
				"id_education": "",
				"education_level": {
					"id_education_level": "",
					"title": ""
				}
			},
		],
		"experience": [
			{
				"id_experience": ""
				"company": "",
				"date": "",
				"profession": {
					"id_profession": "",
					"title": ""
				}
			},
		]
	}
	
```
- returns: application/json

## update account (role: hirer)
- *All object keys must be presented. If they're empty or null or negative they won't update any values
- url: localhost:8080/api/user/update
- method: POST
- content-type: application/json
- body:
 
```  
	{
		"jwt": "jwt key"
		"user": {
			"firstname": "",
			"lastname": "",
			"availability": "",
			"title": "",
			"bio": "",
		},
		"job_post": [
			{
				"description": "",
				"title": "",
				"profession": {
					"id_profession": "",
					"title": ""
				}
			},
		]
	}
	
```
- returns: application/json

## delete account (jwt owner)
- url: localhost:8080/api/user/delete
- method: POST
- content-type: application/json
- body: ` {"jwt":"jwt key"} `
- returns: application/json

## get account
- url: localhost:8080/api/user/get
- method: POST
- content-type: application/json
- body: ` {"jwt":"jwt key", "email": "user's email"} `
- returns: application/json
` All user's data including education, language, experience, job_post, skill `

## get all models
- url: localhost:8080/api/model/get/all
- method: GET
- returns: application/json

```

	"education": [
		{
			"id_education": "",
			"title": ""
		},
	],
	"education_level": [
		{
			"id_education_level": "",
			"title": ""
		},
	],
	"language": [
		{
			"id_language": "",
			"title": ""
		},
	],
	"language_level": [
		{
			"id_language_level": "",
			"title": ""
		},
	],
	"skill": [
		{
			"id_skillI": "",
			"title": ""
		},
	],
	"profession": [
		{
			"id_skill": "",
			"title": ""
		},
	]

```
## search
- url: localhost:8080/api/search/all
- method: POST
- content-type: application/json
- body: ` {"role": "candidate | hirer", "key":"any key to search for"} `
- returns: application/json

```
	res
```




