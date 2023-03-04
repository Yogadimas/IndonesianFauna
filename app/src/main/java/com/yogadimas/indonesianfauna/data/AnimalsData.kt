package com.yogadimas.indonesianfauna.data

import com.yogadimas.indonesianfauna.R
import com.yogadimas.indonesianfauna.model.AnimalModel

object AnimalsData {

    private val animalNames = arrayOf(
        "Anoa",
        "Sumatran Rhinoceros",
        "Javan Rhinoceros",
        "Javan Hawk-Eagle",
        "Sumatran Tiger",
        "Giant Featherback",
        "Komodo Dragon",
        "Banded Linsang",
        "Bawean Deer",
        "Orangutan",
    )

    private val animalImages = intArrayOf(
        R.drawable.anoa,
        R.drawable.badak_bercula_dua,
        R.drawable.badak_bercula_satu,
        R.drawable.burung_elang_jawa,
        R.drawable.harimau_sumatera,
        R.drawable.ikan_belida,
        R.drawable.komodo,
        R.drawable.musang_congkok,
        R.drawable.rusa_bawean,
        R.drawable.urang_utan
    )

    private val animalKingdoms = arrayOf(
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
        "Animalia",
    )

    private val animalPhylums = arrayOf(
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
        "Chordata",
    )

    private val animalClasses = arrayOf(
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Aves",
        "Mammalia",
        "Actinopterygii",
        "Reptilia",
        "Mammalia",
        "Mammalia",
        "Mammalia"
    )

    private val animalOrders = arrayOf(
        "Artiodactyla",
        "Perissodactyla",
        "Perissodactyla",
        "Accipitriformes",
        "Carnivora",
        "Osteoglossiformes",
        "Squamata",
        "Carnivora",
        "Artiodactyla",
        "Primates",


        )

    private val animalFamilies = arrayOf(
        "Bovidae",
        "Rhinocerotidae",
        "Rhinocerotidae",
        "Accipitridae",
        "Felidae",
        "Notopteridae",
        "Varanidae",
        "Prionodontidae",
        "Cervidae",
        "Hominidae"

    )

    private val animalGenera = arrayOf(
        "Bubalus",
        "Dicerorhinus",
        "Rhinoceros",
        "Nisaetus",
        "Panthera",
        "Chitala",
        "Varanus",
        "Prionodon",
        "Hyelapus",
        "Pongo"
    )

    private val animalSpecies = arrayOf(
        "B. depressicornis",
        "D. sumatrensis",
        "R. sondaicus",
        "N. bartelsi",
        "P. tigris",
        "C. lopis",
        "V. komodoensis",
        "P. linsang",
        "H. kuhlii",
        "P. pygemus"
    )

    private val animalScientificNames = arrayOf(
        "Bubalus depressicornis",
        "Dicerorhinus sumatrensis",
        "Rhinoceras sondaicus",
        "Nisaetus bartelsi",
        "Panthera tigris sondaica",
        "Chitala lopis",
        "Varanus komodoensis",
        "Prionodon linsang",
        "Hyelapus kuhlii",
        "Pongo pygemus"
    )

    private val animalOverviews = arrayOf(
        "The lowland anoa (Bubalus depressicornis) is a small bovid, standing barely over 90 cm (35 in) at the shoulder. It is also known as anoa de Ilanura or anoa des plaines. It is most closely allied to the larger Asian buffaloes, showing the same reversal of the direction of the hair on their backs. The horns are peculiar for their upright direction and comparative straightness, although they have the same triangular section as in other buffaloes. White spots are sometimes present below the eyes and there may be white markings on the legs and back; the absence or presence of these white markings may be indicative of distinct races. The horns of the cows are very small. The nearest allies of the anoa appear to be certain extinct Asian buffaloes, the remains of which have been found in the Siwalik Hills of northern India. In habits, the animal appears to resemble the water buffalo.It is usually solitary, living in lowland forests and wetlands, browsing on plants and understory.",
        "The Sumatran rhinoceros, also known as the hairy rhinoceros or Asian two-horned rhinoceros (Dicerorhinus sumatrensis), is a rare member of the family Rhinocerotidae and one of five extant species of rhinoceros. It is the only extant species of the genus Dicerorhinus. It is the smallest rhinoceros, although it is still a large mammal; it stands 112–145 cm (3.67–4.76 ft) high at the shoulder, with a head-and-body length of 2.36–3.18 m (7.7–10.4 ft) and a tail of 35–70 cm (14–28 in). The weight is reported to range from 500 to 1,000 kg (1,100 to 2,200 lb), averaging 700–800 kg (1,540–1,760 lb), although there is a single record of a 2,000 kg (4,410 lb) specimen. Like both African species, it has two horns; the larger is the nasal horn, typically 15–25 cm (5.9–9.8 in), while the other horn is typically a stub. A coat of reddish-brown hair covers most of the Sumatran rhino's body.",
        "The Javan rhinoceros (Rhinoceros sondaicus), also known as the Sunda rhinoceros or lesser one-horned rhinoceros, is a very rare member of the family Rhinocerotidae and one of five extant rhinoceroses. It belongs to the same genus as the Indian rhinoceros, and has similar mosaic, armour-like skin, but at 3.1–3.2 m (10–10 ft) in length and 1.4–1.7 m (4.6–5.6 ft) in height, it is smaller (closer in size to the black rhinoceros of the genus Diceros). Its horn is usually shorter than 25 cm (9.8 in), and is smaller than those of the other rhino species. Only adult males have horns; females lack them altogether.",
        "The Javan hawk-eagle (Nisaetus bartelsi) (earlier placed in Spizaetus) is a medium-sized, approximately 60 cm long, dark brown raptor in the family Accipitridae. Its head and neck are rufous and it is heavily barred black below. This majestic and intricately patterned eagle has a long, black crest on its head; this crest is held almost vertically and is tipped with white. The crown is black, topping a chestnut head and nape. The back and wings are dark brown, fading to a lighter brown tail which has wide cream stripes. The throat is creamy white with a black stripe, running to the whitish breast and underparts, which are heavily barred with chestnut. Juvenile birds are similar in colour, but have plainer underparts and a duller head.The sexes are similar.",
        "The Sumatran tiger is a Panthera tigris sondaica population in the Indonesian island of Sumatra.This population was listed as Critically Endangered on the IUCN Red List in 2008, as it was estimated at 441 to 679 individuals, with no subpopulation larger than 50 individuals and a declining trend.",
        "The giant featherback (Chitala lopis) also known as Indonesian Featherback is a freshwater fish found in Southeast Asia, including Indochina, Malay Peninsula, Borneo, Sumatra and Java in Indonesia. It inhabits lowland river mainstreams and tributaries with rocky and sunken wood bottoms, as well as forest-covered streams. It feeds on smaller fishes, insects and vertebrates, mostly at night.",
        "The Komodo dragon (Varanus komodoensis), also known as the Komodo monitor, is a species of lizard found in the Indonesian islands of Komodo, Rinca, Flores, and Gili Motang.A member of the monitor lizard family Varanidae, it is the largest living species of lizard, growing to a maximum length of 3 metres (10 ft) in rare cases and weighing up to approximately 70 kilograms (150 lb).",
        "The banded linsang (Prionodon linsang) is a linsang, a tree-dwelling carnivorous mammal native to the Sundaic region of Southeast Asia. The banded linsang grows to 35–41.1 centimetres (13.8–16.2 in), with a long tail that can reach 36.2 centimetres (14.3 in).It is a pale yellow with five dark bands. It has broad stripes on its neck and its tail consists of several dark bands with a dark tip. The banded linsang has very sharp retractable claws and razor sharp teeth.",
        "The Bawean deer (Axis kuhlii), also known as Kuhl's hog deer or Bawean hog deer, is a highly threatened species of deer found only in the island of Bawean (Gresik Regency) in Indonesia. A typical height for males of 60–70 cm has been reported. Males have three-tined antlers. Their fawns are spotted at birth, which separates them from the best known western population of the hog deer (H. porcinus).",
        "The orangutan are three extant species of great apes native to Indonesia and Malaysia. Orangutans are currently only found in the rainforests of Borneo and Sumatra. Classified in the genus Pongo, orangutans were originally considered to be one species. From 1996, they were divided into two species: the Bornean orangutan (P. pygmaeus, with three subspecies) and the Sumatran orangutan (P. abelii). In November 2017 it was reported that a third species had been identified, the Tapanuli orangutan (P. tapanuliensis)."
    )

    val listData: ArrayList<AnimalModel>
        get() {
            val list: ArrayList<AnimalModel> = ArrayList()
            for (position in animalNames.indices) {
                val animal = AnimalModel()
                animal.name = animalNames[position]
                animal.image = animalImages[position]
                animal.kingdom = animalKingdoms[position]
                animal.phylum = animalPhylums[position]
                animal.animalClass = animalClasses[position]
                animal.order = animalOrders[position]
                animal.family = animalFamilies[position]
                animal.genus = animalGenera[position]
                animal.species = animalSpecies[position]
                animal.scientificName = animalScientificNames[position]
                animal.overview = animalOverviews[position]
                list.add(animal)
            }
            return list
        }

}