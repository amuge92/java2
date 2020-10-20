var a = [ "a:/02.mp3", "a:/03.mp3", "a:/04.mp3", "a:/01.mp3" ];
	var play = 0;

	var stop = 0;
	$(document).ready(function() {
		$('#play').click(function() {
			if (stop == 0) {
				$('#music')[0].play();
				$('#play').text("일시 정지");
				stop++;

			} else {
				$('#music')[0].pause();
				$('#play').text("음악 재생");
				stop--;
			}
		})
		$('#next').click(function() {
			$('#music').attr("src", a[play % 4]);
			play++;
			$('#music')[0].load();
			$('#music')[0].play();
		})
	});