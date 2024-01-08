import Moralis from "moralis";
const fs = require("fs");

try {
    await Moralis.start({
        apiKey: "YOUR_API_KEY",
    });

    const response = await Moralis.EvmApi.nft.getNFTTransfers({
        chain: "0x1",
        format: "decimal",
        address: "0xb47e3cd837dDF8e4c57F05d70Ab865de6e193BBB",
        tokenId: 1,
    });

    console.log(response.raw);
    const data = response.raw.toString;
    fs.writeFile(
        "topNFTCollectionsByTradingVolume.json",
        data,
        "utf-8",
        (error) => {
            if (error) {
                console.log(error);
                return;
            }
        }
    );
} catch (e) {
    console.error(e);
}
