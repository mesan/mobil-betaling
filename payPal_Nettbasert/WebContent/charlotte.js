startMetode();

function startMetode() {
	console.log("requesting access token...");
	sekundaerMetode();
}

function sekundaerMetode() {
	$.ajax({
        headers: {
             "Accept": "application/json",
             "Accept-Language": "en_US",
             "Authorization": "Basic "+btoa("Ab7aiRCn39xc0AYtcGrzLNFNayQjxAaQivsnWrrs82TK2OFU6fYxp_f-grn0:EN1qzBBhNuHwTOYZSPoCWBej9JWr_sMmSlBWU33D9kzOxZcC4j8cZu1HAEop")
        },
        url: "https://api.sandbox.paypal.com/v1/oauth2/token",
        crossDomain:true,
        type: "POST",
            data: "grant_type=client_credentials",
        complete: function(result) {
            console.log(JSON.stringify(result));
        },
	});

}