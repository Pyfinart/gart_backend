const sdk = require('api')('@reservoirprotocol/v3.0#frn141ploq3rpr4');
const fs = require("fs");

const collection = "0xc92ceddfb8dd984a89fb494c376f9a48b999aafc";
const community = "artblocks";

sdk.auth('demo-api-key');
sdk.getCollectionsActivityV6({
  collection: collection,
//   community: community,
  accept: '*/*'
})
  .then(({ data }) => {
    const jsonString = JSON.stringify(data, null, 2);
        fs.writeFileSync(
            `./data/collectionActivity/activityOf${collection}.json`,
            jsonString,
            "utf8"
        );
        console.log("Fetching completed!");
  })
  .catch(err => console.error(err));