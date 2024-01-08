const sdk = require("api")("@reservoirprotocol/v3.0#axfpg1ilnet08rx");

sdk.auth("demo-api-key");
sdk.getTransfersV4({
    txHash: "0x04654cc4c81882ed4d20b958e0eeb107915d75730110cce65333221439de6afc",
    accept: "*/*",
})
    .then(({ data }) => {
        console.log(data);
    })
    .catch((err) => console.error(err));
