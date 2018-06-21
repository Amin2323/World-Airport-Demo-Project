FROM mongo

COPY csvdata.csv /csvdata.csv
CMD mongoimport --host mongodb --db newdata --collection airports --type csv --file /csvdata.csv --headerline

