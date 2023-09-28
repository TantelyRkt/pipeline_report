# pipeline_report

### Géneration d'un report selon template Excel via Talend

Composant du projet : 

 - une base de données Mysql à importer : _data/database/astekdb.sql_
 - fichier de données : 
 	CSV : WDIData.csv (à télécharger -> https://datacatalog.worldbank.org/dataset/worlddevelopment-indicators et à mettre dans le dossier _data/PROJECT_SRC_PATH/inputs/_)
 	Excel : _data/PROJECT_SRC_PATH/inputs/Corruption Perception Index Data Set.xlsx_
 - Template du rappot généré : _data/PROJECT_SRC_PATH/inputs/Report_template.xlsx_

Le projet Talend se divise en 3 partie : 

1. s1_LoadData_1Shoot : Chargement des données tels que : année (année présente dans les fichiers en input) , indicateur, pays
1. s2_LoadData_4Report : Chargement des données de calcul : Score des indicateurs selon pays,année,indicateur 
1. s3_GenerateReport : Génération d'un rapport par indicateur selon année mis en paramère (variable contexte) -> _local_project/pipeline_report_0_1/contexts/Default.properties (variable : year_report)_

***(La deuxième étape peut prendre du temps car il charge dans la base tous les informations de chaque année présent au sein des fichiers en entrée)***

Pour lancer le projet lancer : _pipeline_report_run.bat_ (windows)

