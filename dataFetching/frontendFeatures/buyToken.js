// import { getClient, Execute } from "@reservoir0x/reservoir-sdk";
const {getClient, Execute} = require("@reservoir0x/reservoir-sdk");
// import { createWalletClient, http } from 'viem'
const { createWalletClient, custom } = require("viem");

address = "0x8ba1f109551bD432803012645Ac136ddd6000000"
wallet = createWalletClient({
  account: address,
  transport: custom(window.ethereum)
})

click = getClient()?.actions.buyToken({
  items: [{ token: "0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d:1", quantity: 1 }],
  wallet,
  // onProgress: (steps: Execute['steps']) => {
  //   console.log(steps)
  // }
  onProgress: (steps) => {
    console.log(steps)
  }
})

document.getElementById("yourButtonId").addEventListener("click", click);