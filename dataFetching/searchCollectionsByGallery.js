const sdk = require("api")("@reservoirprotocol/v3.0#axfpg1ilnet08rx");
const fs = require("fs");

const offset = "0";
// const offsets = ["23", "24", "25", "26", "27", "28", "29", "30"];

// Use offset to request the next batch of items.
// defaults to 0

sdk.auth("demo-api-key");

sdk.getSearchCollectionsV2({
    community: "artblocks",
    limit: "1000",
    // offset: offset,
    accept: "*/*",
})
    .then(({ data }) => {
        // console.log(data);
        const jsonString = JSON.stringify(data, null, 2);
        fs.writeFileSync(
            `./data/collectionOnArtBlocks/artblocks${offset}.json`,
            jsonString,
            "utf8"
        );
        console.log("Fetching completed!");
    })
    .catch((err) => console.error(err));
