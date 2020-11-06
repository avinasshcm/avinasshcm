--
-- *****************************
-- Name : Prachi Vallecha
-- Date : 31-Mar-2015
-- *****************************

UPDATE CBS.CBTB_MODULECONFIGURATION
   SET CBPARAMVALUE = 'true'
WHERE CBMODULENAME = 'Product Integration'
AND   CBPARAMNAME = 'ISEXTERNALSYSTEMINTEGRATED';


UPDATE CBS.CBTB_IDGENERATIONCONFIG
   SET CBBUSINESSIDUSEDBEAN = 'PRODINT'
WHERE CBID = 'LANACCOUNT';


UPDATE CBS.CBTB_IDGENERATIONCONFIG
   SET CBBUSINESSIDUSEDBEAN = 'PRODINT'
WHERE CBID = 'IBANACCOUNT';
