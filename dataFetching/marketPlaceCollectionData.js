const sdk = require("api")("@reservoirprotocol/v3.0#axfpg1ilnet08rx");
// const { saveAs } = require("file-saver");
const fs = require("fs");

sdk.auth("demo-api-key");
// change the id attribute to fetch different collections' data
sdk.getCollectionsV7({
    community: "artblocks",
    sortBy: "updatedAt",
    limit: "1000",
    accept: "*/*",
})
    .then(({ data }) => {
        // console.log(typeof data, data);
        const jsonString = JSON.stringify(data, null, 2);
        // console.log(jsonString);
        // const blob = new Blob([jsonString], { type: "application/json" });
        // saveAs(blob, "0x8d04a8c79ceb0889bdd12acdf3fa9d207ed3ff63.json");
        fs.writeFileSync(
            "./data/marketplaceCollectionData/marketplaceArtBlocks.json",
            jsonString,
            "utf8"
        );
        console.log("Fetching completed!");
    })
    .catch((err) => console.error(err));
