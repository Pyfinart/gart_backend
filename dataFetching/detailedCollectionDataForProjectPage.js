const sdk = require("api")("@reservoirprotocol/v3.0#axfpg1ilnet08rx");

sdk.auth("demo-api-key");
sdk.getCollectionsV7({
    id: "0x8d04a8c79ceb0889bdd12acdf3fa9d207ed3ff63",
    accept: "*/*",
})
    .then(({ data }) => {
        console.log(data);
    })
    .catch((err) => console.error(err));
