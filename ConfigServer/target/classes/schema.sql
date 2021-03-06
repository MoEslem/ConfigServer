DROP TABLE IF EXISTS PROPERTIES;
	 
CREATE TABLE PROPERTIES (
  KEY         VARCHAR(2048),
  VALUE       VARCHAR(4096),
  APPLICATION VARCHAR(128),
  PROFILE     VARCHAR(128),
  LABEL       VARCHAR(128),
  PRIMARY KEY (`KEY`, `APPLICATION`, `PROFILE`, `LABEL`)
);