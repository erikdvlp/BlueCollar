import React, { Component } from 'react';
import electricalIcon from '../assets/img/plug.svg';
import plumbingIcon from '../assets/img/shower.svg';
import heatingIcon from '../assets/img/thermometer.svg';
import applianceIcon from '../assets/img/drill.svg';
import furnitureIcon from '../assets/img/bed.svg';
import movingIcon from '../assets/img/truck.svg';

const tagline = "They work hard. So you don't have to.";
const desc = "BlueCollar connects capable, hands-on professionals with the rest of us.";

class Home extends Component
{
	render()
	{
		return (
			<div className="home">
				<div class="homeSplash">
					<h2>{tagline}</h2>
					<p>{desc}</p>
					<button class="btn btn-primary" type="button">Get started</button>
				</div>
				<div class="homeServices">
					<h3>Our Services</h3>
					<hr/>
					<div class="container">
						<div class="row">
							<div class="col-sm">
								<img class="servIcon" src={electricalIcon} alt="" />
								<h4>Electrical</h4>
								<p class="servDesc">Tired of getting zapped? Leave it to the professionals.</p>
							</div>
							<div class="col-sm">
								<img class="servIcon" src={plumbingIcon} alt="" />
								<h4>Plumbing</h4>
								<p class="servDesc">Who knew toilets were so heavy? Save your back this time.</p>
							</div>
							<div class="col-sm">
								<img class="servIcon" src={heatingIcon} alt="" />
								<h4>Heating &amp; Cooling</h4>
								<p class="servDesc">Winter is coming. Let's get you ready.</p>
							</div>
						</div>
						<div class="row">
							<div class="col-sm">
								<img class="servIcon" src={applianceIcon} alt="" />
								<h4>Appliance Install</h4>
								<p class="servDesc">A double-doored fridge is double the work. These guys do it for a living.</p>
							</div>
							<div class="col-sm">
								<img class="servIcon" src={furnitureIcon} alt="" />
								<h4>Furniture Assembly</h4>
								<p class="servDesc">IKEA is cheap, but assembly is hard. Not anymore.</p>
							</div>
							<div class="col-sm">
								<img class="servIcon" src={movingIcon} alt="" />
								<h4>Moving &amp; Delivery</h4>
								<p class="servDesc">Your buddy sold his pickup, eh? Moving trucks are bigger anyway.</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		)
	}
}

export default Home;