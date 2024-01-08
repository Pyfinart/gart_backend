package main

import (
    "crypto/tls"
    "log"
    "net"
    "net/http"

    "blockwatch.cc/tzgo/rpc"
)


func main() {
    hc := &http.Client{
        Transport: &http.Transport{
            Dial: (&net.Dialer{
                Timeout:   2 * time.Second,
                KeepAlive: 180 * time.Second,
            }).Dial,
            TLSClientConfig: &tls.Config{
                InsecureSkipVerify: true,
            }
        }
    }

    c, err := rpc.NewClient("https://my-private-node.local:8732", hc)
    // api url
    // https://api.tzpro.io/v1/wallets/{address}/nft_positions
    if err != nil {
        log.Fatalln(err)
    }
}