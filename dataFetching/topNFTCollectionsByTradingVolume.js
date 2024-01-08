import { error } from "console";
import Moralis from "moralis";
const fs = require("fs");

try {
    await Moralis.start({
        apiKey: "YOUR_API_KEY",
    });

    const response =
        await Moralis.EvmApi.marketData.getHottestNFTCollectionsByTradingVolume(
            {}
        );

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
