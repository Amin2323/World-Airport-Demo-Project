FROM mongo

COPY csvdatawith.csv /csvdatawith.csv
CMD mongoimport --host mongodb --db newdata --collection airport --type csv --file /csvdatawith.csv --headerline

