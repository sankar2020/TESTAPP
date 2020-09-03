--
-- Database: testapp_db
--

CREATE DATABASE testapp_db;

-- ENTITIES

--
-- Schema entity companyinfo
--

CREATE TABLE IF NOT EXISTS "companyinfo" (
	Description varchar(130) ,
	Facebook varchar(130) ,
	HQAddress varchar(130) ,
	LinkedIn varchar(130) ,
	Name varchar(130) ,
	Twitter varchar(130) ,
	VATID varchar(130) ,
	Website varchar(130) ,
	
	_id SERIAL PRIMARY KEY

);

--
-- Schema entity user
--

CREATE TABLE IF NOT EXISTS "user" (
	Email varchar(130) ,
	ProfileType varchar(130) ,
	RegistrationStatus bool ,
	RoleType varchar(130) ,
	SubscriptionType varchar(130) ,
	UserType varchar(130)  NOT NULL,
	password varchar(130)  NOT NULL,
	
	_id SERIAL PRIMARY KEY

);


-- Security

ALTER TABLE "user" ALTER COLUMN "password" TYPE varchar(128);

INSERT INTO "user" (username, password, _id) VALUES ('admin', '62f264d7ad826f02a8af714c0a54b197935b717656b80461686d450f7b3abde4c553541515de2052b9af70f710f0cd8a1a2d3f4d60aa72608d71a63a9a93c0f5', 1);

CREATE TABLE IF NOT EXISTS "roles" (
	role varchar(30) ,
	
	-- RELAZIONI

	_user INTEGER  NOT NULL REFERENCES "user"(_id),
	_id SERIAL PRIMARY KEY 

);
INSERT INTO "roles" (role, _user, _id) VALUES ('ADMIN', '1', 1);

--
-- Schema entity userinfo
--

CREATE TABLE IF NOT EXISTS "userinfo" (
	Address varchar(130)  NOT NULL,
	Company bool ,
	Country varchar(130)  NOT NULL,
	Firstname varchar(130) ,
	Lastname varchar(130)  NOT NULL,
	WebsiteAddr varchar(130)  NOT NULL,
	
	_id SERIAL PRIMARY KEY

);



