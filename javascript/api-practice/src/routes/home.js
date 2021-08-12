const route = require('express').Router();
const fetchAllRepos = require("../../api/apiConnection");


route.get("/", async (req, res, next) => {
    try {
        const apiData = await fetchAllRepos();

        res.render('home', {
            apiData: apiData[0].id,
        });
    }catch (e) {
        next("Request failed")
    }
});


module.exports = route;
