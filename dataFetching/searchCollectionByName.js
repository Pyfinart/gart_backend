const sdk = require("api")("@reservoirprotocol/v3.0#axfpg1ilnet08rx");

sdk.auth("demo-api-key");
sdk.getSearchCollectionsV2({
    name: "this%20is%20not%20a%20rock",
    accept: "*/*",
})
    .then(({ data }) => {
        console.log(data);
    })
    .catch((err) => console.error(err));
