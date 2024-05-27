<h2 align="center">
  <img src="README_images/SyntHIR_logo.PNG" height="150px">
</h2>

<h4 align="center">
    Accelerating translation from clinical research to tools
</h4>

## Data Wrangling:

It is used to convert data between CSV files and FHIR format. Conversion is a two-step process:

1. It uses the index file called mapping.yaml(located in the folder src/main/resources/mapping.yaml) which holds the mapping details of the input CSV to the FHIR resources and it's respective attributes. Below is the screenshot of the mapping file for the dataset used to demonstrate SyntHIR. The key names of the mapping file are the header name of attributes of the input CSV file.

![](README_images/mapping_file.png "Mapping file")

2. Populates the template of the FHIR resource (located in the folder src/main/resources/FHIRResources/request-templates) with the values of the attributes from the CSV records.

## Getting Started

If you want to just run the Data Wrangling component, should follow the [Run the component using Docker image](#run-the-component-using-docker-image) instructions instead, and to examine or extend the source code, follow [Developer Start Guide](#developer-start-guide) instructions.

### [Run the component using Docker image](#run-the-component-using-docker-image)

The docker image of the component is uploaded on the DockerHub, and docker file is also available in the root directory of the project source code (named as Dockerfile), which needs to be build into a image. The docker image can run on the local machine or on 'play with docker' (https://www.docker.com/play-with-docker/).

To run the dockerfile on the local machine, install docker desktop on windows, linux or mac using the link : https://docs.docker.com/get-docker/. Pull the docker image from docker hub and run it OR Use the dockerfile available in the source code.

To use the docker image from docker hub, pull and run:

```
docker pull synthir21/data_wrangling:v1.0
docker run -p 1234:8081 synthir21/data_wrangling:v1.0
```

To use the dockerfile available in the source code, first clone the repository:

```
git clone https://github.com/synthir/data-wrangling.git
cd data-wrangling
```

Now, build docker image from the dockerfile and run:

```
docker build --tag 'data_wrangling:v1.0' .
docker run -p 1234:8081 data_wrangling:v1.0
```

Argument --tag indicates the repository name for the image (data_wrangling) and tag is v1.0; 8081 is the port number on which the application is running in the container and 1234 is the port number mapped to 8081 port of the container.

### [Developer Start Guide](#developer-start-guide)

These instructions are intended for those who want to examine the source code, extend it or build the code locally.

**System Requirements:** Data Wrangling component requires Java JDK 17 or newer (JDK download link: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).To clone the repository:

```

git clone https://github.com/synthir/data-wrangling.git
cd data-wrangling

```

**Component Configuration:** Update the component configuration files:

```

1. Add the port number to run the component to the properties file called application-prod.properties (located in the folder src/main/resources/application-prod.properties): server.port=XXXX (Port on which the application will run)

2. Update the mapping.yaml file (located in the folder src/main/resources/mapping.yaml) with the key names of the input CSV file

```

**Build and run the component**

```

mvnw clean
mvnw install
mvnw spring-boot:run

```

After running the component, the API can called be called using the hostname:portname followed by the API URL

## Dataset

A sample dataset used for the development of the SyntHIR system is uploaded in the resources folders of the project source code (located in src/main/resources/Dataset/Norway_registry_dataset_sample.csv).

## API details

To run the API, you can use Postman (https://www.postman.com/). The default port in the application properties file is 8081 (properties file located in src/main/resources/application-prod.properties), and default hostname for running on the local machine is 'localhost'.

1. Convert CSV to FHIR resources

   1. Request URL: http://hostname:port-number/api/v1/data-wrangling/convert/npr/csv-to-fhir
   2. Request Type: POST
   3. Request Body: Will be 'form-data' and type of value as 'file'. Key name of the CSV file request param is "file".
   4. Response Body: Will be a list of JSON objects (Example of single JSON object from the list). Sample of JSON response is below:

   ```json
   [
     {
       "patient": {
         "resourceType": "Patient",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "34579"
           }
         ],
         "name": null,
         "gender": "female",
         "birthDate": "1921",
         "deceasedBoolean": false,
         "deceasedDateTime": "2013-02",
         "address": [
           {
             "use": "",
             "city": "Hordaland Fylkeskommune",
             "district": "",
             "state": "",
             "postalCode": "12",
             "country": "Norway"
           }
         ],
         "extension": [
           {
             "valueString": "6"
           }
         ]
       },
       "practitioner": {
         "resourceType": "Practitioner",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "42293"
           }
         ],
         "name": null,
         "gender": "male",
         "birthDate": "1952"
       },
       "location": {
         "resourceType": "Location",
         "identifier": null,
         "name": "Helse Bergen HF Haukeland",
         "mode": null,
         "address": null
       },
       "condition": {
         "resourceType": "Condition",
         "identifier": null,
         "code": {
           "coding": [
             {
               "code": "I49",
               "system": "http://hl7.org/fhir/sid/icd-10",
               "display": null
             }
           ],
           "text": "ICD-10 Codes"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient associated with the condition",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with Patient",
           "type": "Encounter"
         }
       },
       "encounter": {
         "resourceType": "Encounter",
         "identifier": null,
         "status": "finished",
         "type": null,
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient Hospitalized",
           "type": "Patient"
         },
         "location": [
           {
             "location": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Institute Name where prescribed",
               "type": "Location"
             },
             "status": null
           }
         ],
         "hospitalization": {
           "dischargeDisposition": {
             "coding": [
               {
                 "code": "Other",
                 "system": "http://terminology.hl7.org/CodeSystem/discharge-disposition",
                 "display": null
               }
             ],
             "text": "Others"
           }
         },
         "period": {
           "start": "8/14/2013",
           "end": "8/14/2013"
         },
         "diagnosis": null,
         "participant": [
           {
             "individual": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Practitioner Details for the patient hospitalized",
               "type": "Practitioner"
             }
           }
         ],
         "class": {
           "code": "PRENC",
           "system": "http://terminology.hl7.org/CodeSystem/v3-ActCode",
           "display": "Patient arrival mode for the Encounter"
         }
       },
       "medication": {
         "resourceType": "Medication",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "267967"
           }
         ],
         "code": {
           "coding": [
             {
               "code": "C01AA04",
               "system": "http://www.whocc.no/atc",
               "display": null
             }
           ],
           "text": "Digimerck pico tab 0,05mg"
         }
       },
       "medicationRequest": {
         "resourceType": "MedicationRequest",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "61526227"
           }
         ],
         "status": "unknown",
         "intent": "option",
         "category": [
           {
             "coding": [
               {
                 "code": "",
                 "system": null,
                 "display": null
               }
             ],
             "text": "BlÃ¥reseptordningen Â§Â§ 2, 3a, 3b, 4 og 5 (gammel ordning Â§Â§ 2, 3, 4, 9, og 10a)"
           }
         ],
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medications for the prescription",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the prescription",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with the prescription",
           "type": "Encounter"
         },
         "recorder": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Practitioner who prescribed the prescription",
           "type": "Practitioner"
         },
         "note": [
           {
             "authorString": "Legal Reimbursement category for the prescription",
             "text": "3"
           },
           {
             "authorString": "Legal Reimbursement code for the prescription",
             "text": "6"
           },
           {
             "authorString": "Reimbursement code for the prescription - ICD/ICPC",
             "text": "ICPC:K77"
           }
         ],
         "dosageInstruction": [
           {
             "text": "Defined daily dose of the drug",
             "doseAndRate": [
               {
                 "doseQuantity": {
                   "value": 0.1,
                   "unit": "mg"
                 },
                 "rateQuantity": {
                   "value": 0.0,
                   "unit": "Per Day"
                 }
               }
             ]
           }
         ]
       },
       "medicationDispense": {
         "resourceType": "MedicationDispense",
         "status": "unknown",
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medication details for the dispense",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the\r\nprescription",
           "type": "Patient"
         },
         "authorizingPrescription": [
           {
             "reference": "",
             "identifier": {
               "use": null,
               "system": null,
               "value": ""
             },
             "display": "Prescription for the Medication",
             "type": "MedicationRequest"
           }
         ],
         "quantity": {
           "value": 0.01,
           "unit": null
         },
         "daysSupply": {
           "value": 0.5,
           "unit": null
         },
         "whenHandedOver": "5/12/2014"
       }
     },
     {
       "patient": {
         "resourceType": "Patient",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "34579"
           }
         ],
         "name": null,
         "gender": "female",
         "birthDate": "1921",
         "deceasedBoolean": false,
         "deceasedDateTime": "2013-02",
         "address": [
           {
             "use": "",
             "city": "Hordaland Fylkeskommune",
             "district": "",
             "state": "",
             "postalCode": "12",
             "country": "Norway"
           }
         ],
         "extension": [
           {
             "valueString": "6"
           }
         ]
       },
       "practitioner": {
         "resourceType": "Practitioner",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "42293"
           }
         ],
         "name": null,
         "gender": "male",
         "birthDate": "1952"
       },
       "location": {
         "resourceType": "Location",
         "identifier": null,
         "name": "Helse Bergen HF Haukeland",
         "mode": null,
         "address": null
       },
       "condition": {
         "resourceType": "Condition",
         "identifier": null,
         "code": {
           "coding": [
             {
               "code": "I49",
               "system": "http://hl7.org/fhir/sid/icd-10",
               "display": null
             }
           ],
           "text": "ICD-10 Codes"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient associated with the condition",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with Patient",
           "type": "Encounter"
         }
       },
       "encounter": {
         "resourceType": "Encounter",
         "identifier": null,
         "status": "finished",
         "type": null,
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient Hospitalized",
           "type": "Patient"
         },
         "location": [
           {
             "location": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Institute Name where prescribed",
               "type": "Location"
             },
             "status": null
           }
         ],
         "hospitalization": {
           "dischargeDisposition": {
             "coding": [
               {
                 "code": "Other",
                 "system": "http://terminology.hl7.org/CodeSystem/discharge-disposition",
                 "display": null
               }
             ],
             "text": "Others"
           }
         },
         "period": {
           "start": "8/14/2013",
           "end": "8/14/2013"
         },
         "diagnosis": null,
         "participant": [
           {
             "individual": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Practitioner Details for the patient hospitalized",
               "type": "Practitioner"
             }
           }
         ],
         "class": {
           "code": "PRENC",
           "system": "http://terminology.hl7.org/CodeSystem/v3-ActCode",
           "display": "Patient arrival mode for the Encounter"
         }
       },
       "medication": {
         "resourceType": "Medication",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "85944"
           }
         ],
         "code": {
           "coding": [
             {
               "code": "N02BE01",
               "system": "http://www.whocc.no/atc",
               "display": null
             }
           ],
           "text": "Panodil tab 1g"
         }
       },
       "medicationRequest": {
         "resourceType": "MedicationRequest",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "54953344"
           }
         ],
         "status": "unknown",
         "intent": "option",
         "category": [
           {
             "coding": [
               {
                 "code": "",
                 "system": null,
                 "display": null
               }
             ],
             "text": "Normalresepter"
           }
         ],
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medications for the prescription",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the prescription",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with the prescription",
           "type": "Encounter"
         },
         "recorder": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Practitioner who prescribed the prescription",
           "type": "Practitioner"
         },
         "note": [
           {
             "authorString": "Legal Reimbursement category for the prescription",
             "text": "7"
           },
           {
             "authorString": "Legal Reimbursement code for the prescription",
             "text": ""
           },
           {
             "authorString": "Reimbursement code for the prescription - ICD/ICPC",
             "text": "ICPC:"
           }
         ],
         "dosageInstruction": [
           {
             "text": "Defined daily dose of the drug",
             "doseAndRate": [
               {
                 "doseQuantity": {
                   "value": 3.0,
                   "unit": "g"
                 },
                 "rateQuantity": {
                   "value": 0.0,
                   "unit": "Per Day"
                 }
               }
             ]
           }
         ]
       },
       "medicationDispense": {
         "resourceType": "MedicationDispense",
         "status": "unknown",
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medication details for the dispense",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the\r\nprescription",
           "type": "Patient"
         },
         "authorizingPrescription": [
           {
             "reference": "",
             "identifier": {
               "use": null,
               "system": null,
               "value": ""
             },
             "display": "Prescription for the Medication",
             "type": "MedicationRequest"
           }
         ],
         "quantity": {
           "value": 0.14,
           "unit": null
         },
         "daysSupply": {
           "value": 4.667,
           "unit": null
         },
         "whenHandedOver": "4/7/2014"
       }
     }
   ]
   ```

2. Convert FHIR resource list to CSV file

   1. Request URL: http://hostname:port-number/api/v1/data-wrangling/convert/npr/fhir-to-csv
   2. Request Type: POST
   3. Request Body: Will be a list of JSON objects. Example of JSON is given below:

   ```json
   [
     {
       "patient": {
         "resourceType": "Patient",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "34579"
           }
         ],
         "name": null,
         "gender": "female",
         "birthDate": "1921",
         "deceasedBoolean": false,
         "deceasedDateTime": "2013-02",
         "address": [
           {
             "use": "",
             "city": "Hordaland Fylkeskommune",
             "district": "",
             "state": "",
             "postalCode": "12",
             "country": "Norway"
           }
         ],
         "extension": [
           {
             "valueString": "6"
           }
         ]
       },
       "practitioner": {
         "resourceType": "Practitioner",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "42293"
           }
         ],
         "name": null,
         "gender": "male",
         "birthDate": "1952"
       },
       "location": {
         "resourceType": "Location",
         "identifier": null,
         "name": "Helse Bergen HF Haukeland",
         "mode": null,
         "address": null
       },
       "condition": {
         "resourceType": "Condition",
         "identifier": null,
         "code": {
           "coding": [
             {
               "code": "I49",
               "system": "http://hl7.org/fhir/sid/icd-10",
               "display": null
             }
           ],
           "text": "ICD-10 Codes"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient associated with the condition",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with Patient",
           "type": "Encounter"
         }
       },
       "encounter": {
         "resourceType": "Encounter",
         "identifier": null,
         "status": "finished",
         "type": null,
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient Hospitalized",
           "type": "Patient"
         },
         "location": [
           {
             "location": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Institute Name where prescribed",
               "type": "Location"
             },
             "status": null
           }
         ],
         "hospitalization": {
           "dischargeDisposition": {
             "coding": [
               {
                 "code": "Other",
                 "system": "http://terminology.hl7.org/CodeSystem/discharge-disposition",
                 "display": null
               }
             ],
             "text": "Others"
           }
         },
         "period": {
           "start": "8/14/2013",
           "end": "8/14/2013"
         },
         "diagnosis": null,
         "participant": [
           {
             "individual": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Practitioner Details for the patient hospitalized",
               "type": "Practitioner"
             }
           }
         ],
         "class": {
           "code": "PRENC",
           "system": "http://terminology.hl7.org/CodeSystem/v3-ActCode",
           "display": "Patient arrival mode for the Encounter"
         }
       },
       "medication": {
         "resourceType": "Medication",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "267967"
           }
         ],
         "code": {
           "coding": [
             {
               "code": "C01AA04",
               "system": "http://www.whocc.no/atc",
               "display": null
             }
           ],
           "text": "Digimerck pico tab 0,05mg"
         }
       },
       "medicationRequest": {
         "resourceType": "MedicationRequest",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "61526227"
           }
         ],
         "status": "unknown",
         "intent": "option",
         "category": [
           {
             "coding": [
               {
                 "code": "",
                 "system": null,
                 "display": null
               }
             ],
             "text": "BlÃ¥reseptordningen Â§Â§ 2, 3a, 3b, 4 og 5 (gammel ordning Â§Â§ 2, 3, 4, 9, og 10a)"
           }
         ],
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medications for the prescription",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the prescription",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with the prescription",
           "type": "Encounter"
         },
         "recorder": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Practitioner who prescribed the prescription",
           "type": "Practitioner"
         },
         "note": [
           {
             "authorString": "Legal Reimbursement category for the prescription",
             "text": "3"
           },
           {
             "authorString": "Legal Reimbursement code for the prescription",
             "text": "6"
           },
           {
             "authorString": "Reimbursement code for the prescription - ICD/ICPC",
             "text": "ICPC:K77"
           }
         ],
         "dosageInstruction": [
           {
             "text": "Defined daily dose of the drug",
             "doseAndRate": [
               {
                 "doseQuantity": {
                   "value": 0.1,
                   "unit": "mg"
                 },
                 "rateQuantity": {
                   "value": 0.0,
                   "unit": "Per Day"
                 }
               }
             ]
           }
         ]
       },
       "medicationDispense": {
         "resourceType": "MedicationDispense",
         "status": "unknown",
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medication details for the dispense",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the\r\nprescription",
           "type": "Patient"
         },
         "authorizingPrescription": [
           {
             "reference": "",
             "identifier": {
               "use": null,
               "system": null,
               "value": ""
             },
             "display": "Prescription for the Medication",
             "type": "MedicationRequest"
           }
         ],
         "quantity": {
           "value": 0.01,
           "unit": null
         },
         "daysSupply": {
           "value": 0.5,
           "unit": null
         },
         "whenHandedOver": "5/12/2014"
       }
     },
     {
       "patient": {
         "resourceType": "Patient",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "34579"
           }
         ],
         "name": null,
         "gender": "female",
         "birthDate": "1921",
         "deceasedBoolean": false,
         "deceasedDateTime": "2013-02",
         "address": [
           {
             "use": "",
             "city": "Hordaland Fylkeskommune",
             "district": "",
             "state": "",
             "postalCode": "12",
             "country": "Norway"
           }
         ],
         "extension": [
           {
             "valueString": "6"
           }
         ]
       },
       "practitioner": {
         "resourceType": "Practitioner",
         "identifier": [
           {
             "use": "temp",
             "system": null,
             "value": "42293"
           }
         ],
         "name": null,
         "gender": "male",
         "birthDate": "1952"
       },
       "location": {
         "resourceType": "Location",
         "identifier": null,
         "name": "Helse Bergen HF Haukeland",
         "mode": null,
         "address": null
       },
       "condition": {
         "resourceType": "Condition",
         "identifier": null,
         "code": {
           "coding": [
             {
               "code": "I49",
               "system": "http://hl7.org/fhir/sid/icd-10",
               "display": null
             }
           ],
           "text": "ICD-10 Codes"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient associated with the condition",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with Patient",
           "type": "Encounter"
         }
       },
       "encounter": {
         "resourceType": "Encounter",
         "identifier": null,
         "status": "finished",
         "type": null,
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient Hospitalized",
           "type": "Patient"
         },
         "location": [
           {
             "location": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Institute Name where prescribed",
               "type": "Location"
             },
             "status": null
           }
         ],
         "hospitalization": {
           "dischargeDisposition": {
             "coding": [
               {
                 "code": "Other",
                 "system": "http://terminology.hl7.org/CodeSystem/discharge-disposition",
                 "display": null
               }
             ],
             "text": "Others"
           }
         },
         "period": {
           "start": "8/14/2013",
           "end": "8/14/2013"
         },
         "diagnosis": null,
         "participant": [
           {
             "individual": {
               "reference": "",
               "identifier": {
                 "use": null,
                 "system": null,
                 "value": ""
               },
               "display": "Practitioner Details for the patient hospitalized",
               "type": "Practitioner"
             }
           }
         ],
         "class": {
           "code": "PRENC",
           "system": "http://terminology.hl7.org/CodeSystem/v3-ActCode",
           "display": "Patient arrival mode for the Encounter"
         }
       },
       "medication": {
         "resourceType": "Medication",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "85944"
           }
         ],
         "code": {
           "coding": [
             {
               "code": "N02BE01",
               "system": "http://www.whocc.no/atc",
               "display": null
             }
           ],
           "text": "Panodil tab 1g"
         }
       },
       "medicationRequest": {
         "resourceType": "MedicationRequest",
         "identifier": [
           {
             "use": null,
             "system": null,
             "value": "54953344"
           }
         ],
         "status": "unknown",
         "intent": "option",
         "category": [
           {
             "coding": [
               {
                 "code": "",
                 "system": null,
                 "display": null
               }
             ],
             "text": "Normalresepter"
           }
         ],
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medications for the prescription",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the prescription",
           "type": "Patient"
         },
         "encounter": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Encounter associated with the prescription",
           "type": "Encounter"
         },
         "recorder": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Practitioner who prescribed the prescription",
           "type": "Practitioner"
         },
         "note": [
           {
             "authorString": "Legal Reimbursement category for the prescription",
             "text": "7"
           },
           {
             "authorString": "Legal Reimbursement code for the prescription",
             "text": ""
           },
           {
             "authorString": "Reimbursement code for the prescription - ICD/ICPC",
             "text": "ICPC:"
           }
         ],
         "dosageInstruction": [
           {
             "text": "Defined daily dose of the drug",
             "doseAndRate": [
               {
                 "doseQuantity": {
                   "value": 3.0,
                   "unit": "g"
                 },
                 "rateQuantity": {
                   "value": 0.0,
                   "unit": "Per Day"
                 }
               }
             ]
           }
         ]
       },
       "medicationDispense": {
         "resourceType": "MedicationDispense",
         "status": "unknown",
         "medicationReference": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Medication details for the dispense",
           "type": "Medication"
         },
         "subject": {
           "reference": "",
           "identifier": {
             "use": null,
             "system": null,
             "value": ""
           },
           "display": "Patient for the\r\nprescription",
           "type": "Patient"
         },
         "authorizingPrescription": [
           {
             "reference": "",
             "identifier": {
               "use": null,
               "system": null,
               "value": ""
             },
             "display": "Prescription for the Medication",
             "type": "MedicationRequest"
           }
         ],
         "quantity": {
           "value": 0.14,
           "unit": null
         },
         "daysSupply": {
           "value": 4.667,
           "unit": null
         },
         "whenHandedOver": "4/7/2014"
       }
     }
   ]
   ```

   4. Response Body: CSV file
