# pipeline_report

Géneration d'un report selon template Excel via Talend

Composant du projet : 

 - une base de données Mysql à importer : data/database/astekdb.sql
 - fichier de données : 
 	CSV : WDIData.csv (à télécharger -> https://datacatalog.worldbank.org/dataset/worlddevelopment-indicators et à mettre dans le dossier data/PROJECT_SRC_PATH/inputs/)
 	Excel : data/PROJECT_SRC_PATH/inputs/Corruption Perception Index Data Set.xlsx
 - Template du rappot généré : data/PROJECT_SRC_PATH/inputs/Report_template.xlsx

Le projet Talend se divise en 3 partie : 

1 - s1_LoadData_1Shoot : Chargement des données tels que : année (année présente dans les fichiers en input) , indicateur, pays
2 - s2_LoadData_4Report : Chargement des données de calcul : Score des indicateurs selon pays,année,indicateur 
3 - s3_GenerateReport : Génération d'un rapport par indicateur selon année mis en paramère (variable contexte)

(La deuxième étape peut prendre du temps car il charge dans la base tous les informations de chaque année présent au sein des fichiers en entrée);

