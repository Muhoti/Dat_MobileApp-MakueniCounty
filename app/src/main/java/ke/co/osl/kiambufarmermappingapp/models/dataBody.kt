package ke.co.osl.kiambufarmermappingapp.models


data class dataBody(
   val NationalID: String,
   val Name: String,
   val Phone: String,
   val Gender: String,
   val AgeGroup: String,
   val FarmingType: String,
   val FarmerId: String,
   val County: String,
   val SubCounty: String,
   val Ward: String,
   val Latitude: Double,
   val Longitude: Double,
   val Village: String,
   val TotalAcreage: String,
   val CropAcreage: String,
   val LivestockAcreage: String,
   val IrrigationType: String,
   val FarmOwnership: String,
   val CIG: String,
   val PO: String,
   val Sacco: String,
   val Produce: String,
   val HarvestDate: Double,
   val FarmingPeriod: Number,
   val IW: String,
   val Variety: String,
   val Unit: String,
   val ApproxAcreage: String,
   val AvgYearlyProduction: String,
   val AvgHarvestProduction: String
)