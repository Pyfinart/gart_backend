const sdk = require('api')('@reservoirprotocol/v3.0#frn141ploq3rpr4');
const fs = require("fs");

const collection = "0xc92ceddfb8dd984a89fb494c376f9a48b999aafc";
const token = '0xc92ceddfb8dd984a89fb494c376f9a48b999aafc%3A9889'
// 不能同时查询token和collection

sdk.auth('demo-api-key');
sdk.getOrdersBidsV6({
  // token: token,
  collection: collection,
  accept: '*/*'
})
  
.then(({ data }) => {
  const jsonString = JSON.stringify(data, null, 2);
      fs.writeFileSync(
          `./data/offers/offersOf${collection}.json`,
          jsonString,
          "utf8"
      );
      console.log("Fetching completed!");
})
.catch(err => console.error(err));