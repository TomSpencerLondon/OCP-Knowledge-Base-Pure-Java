const express = require('express');

const root = require('./root.route');
const players = require('./players.route');

const router = express.Router();

router.use('/', root);
router.use('/players', players);

module.exports = router;
